package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.net.URL;

/**
 * @author Santiago Carrillo
 */
@Entity
public class Team{
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "shortName")
    public String shortName;

    @ColumnInfo(name= "imageUrl")
    public String imageUrl;
}

