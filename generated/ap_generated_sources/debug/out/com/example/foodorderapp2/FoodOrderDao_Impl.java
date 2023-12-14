package com.example.foodorderapp2;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodOrderDao_Impl implements FoodOrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FoodOrder> __insertionAdapterOfFoodOrder;

  public FoodOrderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFoodOrder = new EntityInsertionAdapter<FoodOrder>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `food_order` (`id`,`foodOrderId`,`foodName`,`foodPrice`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodOrder value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getFoodOrderId());
        if (value.getFoodName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFoodName());
        }
        stmt.bindDouble(4, value.getFoodPrice());
      }
    };
  }

  @Override
  public void insertFoodOrder(final FoodOrder foodOrder) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFoodOrder.insert(foodOrder);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<FoodOrder> getAllFoodOrders() {
    final String _sql = "SELECT * FROM food_order";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFoodOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "foodOrderId");
      final int _cursorIndexOfFoodName = CursorUtil.getColumnIndexOrThrow(_cursor, "foodName");
      final int _cursorIndexOfFoodPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPrice");
      final List<FoodOrder> _result = new ArrayList<FoodOrder>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FoodOrder _item;
        _item = new FoodOrder();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final int _tmpFoodOrderId;
        _tmpFoodOrderId = _cursor.getInt(_cursorIndexOfFoodOrderId);
        _item.setFoodOrderId(_tmpFoodOrderId);
        final String _tmpFoodName;
        _tmpFoodName = _cursor.getString(_cursorIndexOfFoodName);
        _item.setFoodName(_tmpFoodName);
        final double _tmpFoodPrice;
        _tmpFoodPrice = _cursor.getDouble(_cursorIndexOfFoodPrice);
        _item.setFoodPrice(_tmpFoodPrice);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
