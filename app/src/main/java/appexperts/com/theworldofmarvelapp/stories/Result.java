package appexperts.com.theworldofmarvelapp.stories;

/**
 * Created by TheAppExperts on 04/11/2016.
 */
@Generated("org.jsonschema2pojo")
public class Result {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("urls")
    @Expose
    private List<Url> urls = new ArrayList<Url>();
    @SerializedName("startYear")
    @Expose
    private Integer startYear;
    @SerializedName("endYear")
    @Expose
    private Integer endYear;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("creators")
    @Expose
    private Creators creators;
    @SerializedName("characters")
    @Expose
    private Characters characters;
    @SerializedName("stories")
    @Expose
    private Stories stories;
    @SerializedName("comics")
    @Expose
    private Comics comics;
    @SerializedName("events")
    @Expose
    private Events events;
    @SerializedName("next")
    @Expose
    private Object next;
    @SerializedName("previous")
    @Expose
    private Object previous;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The resourceURI
     */
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     *
     * @param resourceURI
     * The resourceURI
     */
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    /**
     *
     * @return
     * The urls
     */
    public List<Url> getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     * The urls
     */
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    /**
     *
     * @return
     * The startYear
     */
    public Integer getStartYear() {
        return startYear;
    }

    /**
     *
     * @param startYear
     * The startYear
     */
    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    /**
     *
     * @return
     * The endYear
     */
    public Integer getEndYear() {
        return endYear;
    }

    /**
     *
     * @param endYear
     * The endYear
     */
    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    /**
     *
     * @return
     * The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     * The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     * The thumbnail
     */
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     *
     * @return
     * The creators
     */
    public Creators getCreators() {
        return creators;
    }

    /**
     *
     * @param creators
     * The creators
     */
    public void setCreators(Creators creators) {
        this.creators = creators;
    }

    /**
     *
     * @return
     * The characters
     */
    public Characters getCharacters() {
        return characters;
    }

    /**
     *
     * @param characters
     * The characters
     */
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    /**
     *
     * @return
     * The stories
     */
    public Stories getStories() {
        return stories;
    }

    /**
     *
     * @param stories
     * The stories
     */
    public void setStories(Stories stories) {
        this.stories = stories;
    }

    /**
     *
     * @return
     * The comics
     */
    public Comics getComics() {
        return comics;
    }

    /**
     *
     * @param comics
     * The comics
     */
    public void setComics(Comics comics) {
        this.comics = comics;
    }

    /**
     *
     * @return
     * The events
     */
    public Events getEvents() {
        return events;
    }

    /**
     *
     * @param events
     * The events
     */
    public void setEvents(Events events) {
        this.events = events;
    }

    /**
     *
     * @return
     * The next
     */
    public Object getNext() {
        return next;
    }

    /**
     *
     * @param next
     * The next
     */
    public void setNext(Object next) {
        this.next = next;
    }

    /**
     *
     * @return
     * The previous
     */
    public Object getPrevious() {
        return previous;
    }

    /**
     *
     * @param previous
     * The previous
     */
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

}
