package ua.somedomen.IBelive.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@ToString
public class ListURL{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfVideo;
    private String textForVideo;
    private String url;

    public ListURL(String nameOfVideo, String textForVideo, String url) {
        this.nameOfVideo = nameOfVideo;
        this.textForVideo = textForVideo;
        this.url = url;
    }

    public ListURL() {
    }
}
