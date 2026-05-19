package xyz.zcraft.osu.model;

import com.google.gson.annotations.SerializedName;

public record UserRelation(
        @SerializedName("target_id") int targetId,
        @SerializedName("relation_type") String relationType,
        boolean mutual,
        User target) {
}
