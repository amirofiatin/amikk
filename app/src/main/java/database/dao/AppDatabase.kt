package com.example.aplikasilaundry.database.dao;

import database.dao.LaundryDao

@database(entittes = {ModelLaundry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LaundryDao();
}