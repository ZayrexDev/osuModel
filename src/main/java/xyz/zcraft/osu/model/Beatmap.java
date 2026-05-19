package xyz.zcraft.osu.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Beatmap {
    @SerializedName("beatmapset_id")
    public Long beatmapsetId;
    public Long id;
    @SerializedName("difficulty_rating")
    public Double difficultyRating;
    public Object mode;
    public String status;
    @SerializedName("total_length")
    public Long totalLength;
    @SerializedName("user_id")
    public Long userId;
    public String version;
    @SerializedName("top_tag_ids")
    public List<UserTagId> topUserTagIds;

    @Data
    public static class Covers {
        public String cover;

        @SerializedName("cover@2x")
        public String cover2x;

        public String card;

        @SerializedName("card@2x")
        public String card2x;

        public String list;

        @SerializedName("list@2x")
        public String list2x;

        public String slimcover;

        @SerializedName("slimcover@2x")
        public String slimcover2x;
    }

    @Data
    public static class UserTagId {
        @SerializedName("tag_id")
        public int tagId;
        public int count;
    }
}
