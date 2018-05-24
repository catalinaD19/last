package ro.pub.cs.systems.eim.practicaltest02.model;

public class URLInformation {

    private String URL;
    private String body;

    public URLInformation() {
        this.body = null;
        this.URL = null;
    }

    public URLInformation(String URL, String body) {
        this.URL = URL;
        this.body = body;
    }

    public String getURL() {
        return URL;
    }

    public void setURL (String URL) {
        this.URL = URL;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "URLINFORMATION{" +
                "URL='" + URL + '\'' +
                ", body='" + body +
                '}';
    }

}
