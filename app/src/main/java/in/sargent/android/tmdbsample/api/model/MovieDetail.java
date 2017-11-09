package in.sargent.android.tmdbsample.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sargentin on 07/11/2017.
 */

public class MovieDetail {

    /**
     * adult : false
     * backdrop_path : /tcheoA2nPATCm2vvXw2hVQoaEFD.jpg
     * belongs_to_collection : null
     * budget : 35000000
     * genres : [{"id":18,"name":"Drama"},{"id":27,"name":"Horror"},{"id":53,"name":"Thriller"}]
     * homepage : http://itthemovie.com/
     * id : 346364
     * imdb_id : tt1396484
     * original_language : en
     * original_title : It
     * overview : In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.
     * popularity : 782.997954
     * poster_path : /9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg
     * production_companies : [{"name":"New Line Cinema","id":12},{"name":"Vertigo Entertainment","id":829},{"name":"Lin Pictures","id":2723},{"name":"RatPac-Dune Entertainment","id":41624},{"name":"KatzSmith Productions","id":87671}]
     * production_countries : [{"iso_3166_1":"US","name":"United States of America"}]
     * release_date : 2017-09-05
     * revenue : 555575232
     * runtime : 135
     * spoken_languages : [{"iso_639_1":"de","name":"Deutsch"}]
     * status : Released
     * tagline : Your fears are unleashed
     * title : It
     * video : false
     * vote_average : 7.3
     * vote_count : 3410
     */

    private boolean adult;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("belongs_to_collection")
    private Object belongsToCollection;

    private int budget;
    private String homepage;
    private int id;

    @SerializedName("imdb_id")
    private String imdbId;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    private String overview;
    private double popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("release_date")
    private String releaseDate;

    private int revenue;
    private int runtime;
    private String status;
    private String tagline;
    private String title;
    private boolean video;

    @SerializedName("vote_average")
    private double voteAverage;

    @SerializedName("vote_count")
    private int voteCount;

    private List<Genres> genres;

    @SerializedName("production_companies")
    private List<ProductionCompanies> productionCompanies;

    @SerializedName("production_countries")
    private List<ProductionCountries> productionCountries;

    @SerializedName("spoken_languages")
    private List<SpokenLanguages> spokenLanguages;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public List<ProductionCompanies> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompanies> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<ProductionCountries> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(List<ProductionCountries> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public List<SpokenLanguages> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(List<SpokenLanguages> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public static class Genres {
        /**
         * id : 18
         * name : Drama
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ProductionCompanies {
        /**
         * name : New Line Cinema
         * id : 12
         */

        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class ProductionCountries {
        /**
         * iso_3166_1 : US
         * name : United States of America
         */

        @SerializedName("iso_3166_1")
        private String iso31661;

        private String name;

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SpokenLanguages {
        /**
         * iso_639_1 : de
         * name : Deutsch
         */

        @SerializedName("iso_639_1")
        private String iso6391;

        private String name;

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
