package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * @author Santiago Carrillo
 */

@Dao
public interface TeamDao{
    @Query("SELECT * FROM team")
    List<Team> getAll();


    @Query("SELECT * FROM team WHERE uid IN (:teamsIds)")
    List<Team> loadAllByIds(int[] teamsIds);

    @Query("SELECT * FROM team WHERE name LIKE (:name) OR name LIKE (:shortName)")
    Team findByName(String name, String shortName);

    @Insert
    void insertAll(Team... teams);

    @Delete
    void delete(Team team);

}



