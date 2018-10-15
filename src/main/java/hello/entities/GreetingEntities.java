package hello.entities;

public class GreetingEntities {
    private final long id;
    private final String content;

    public GreetingEntities(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
