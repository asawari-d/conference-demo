package com.jaya.conferencedemo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;


@Entity(name = "speakers")
@NoArgsConstructor
@Data
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions;

}
