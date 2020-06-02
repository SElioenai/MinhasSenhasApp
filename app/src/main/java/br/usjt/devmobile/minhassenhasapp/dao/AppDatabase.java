package br.usjt.devmobile.minhassenhasapp.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.usjt.devmobile.minhassenhasapp.model.Senha;

@Database(entities = {Senha.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SenhaDao senhaDao();
}