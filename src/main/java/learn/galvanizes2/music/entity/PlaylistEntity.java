package learn.galvanizes2.music.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlaylistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String playlistName;
    @OneToMany(mappedBy = "songName")
    List<SongEntity> trackList = new ArrayList<>();

    public void add(SongEntity songEntity) {
        trackList.add(songEntity);
    }
}
