package appexperts.com.theworldofmarvelapp.series;

/**
 * Created by TheAppExperts on 04/11/2016.
 */
@Generated("org.jsonschema2pojo")
public class Thumbnail {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("extension")
    @Expose
    private String extension;

    /**
     *
     * @return
     * The path
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     * The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     * The extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     * The extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

}
