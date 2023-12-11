package database.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.insert;
import androidx.room.onConflictStrategy;
import androidx.room.Query;

import com.example.aplikasilaundry.model.ModelLaundry;

import java.util.List;

@Dao
public interface LaundryDao {

    @Query("SELECT * FROM tbl_laundry")
    liveData<List<ModelLaundry>> getALL();

    @Insert(onConfLict = OnConflictStrategy.REPLACE)
    void insertData(ModelLaundry...modelLaundries);

    @Query("DALATE FROM tbl_laundry")
    void deleteAllData();

    @Query("DELETE FROM tbl_laundry WHARE uid= :uid")
    void deletedAllData();

    @Query("UPDATE tbl_laundry SET nama_jasa = :nama_jasa, items = :items, alamat = :alamat, harga = :harga WHARE uid = :uid")
    void updateData(String nama_jasa, int items, String alamat, int harga, int uid);

}
