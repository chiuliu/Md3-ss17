package ss17.springwebmvc.dao;

import ss17.springwebmvc.model.Account;

import java.util.List;

public interface IAccountDao {
    // Lấy về list để hiển thị

    List<Account> fi    ndAll();

    // Tìm kiếm theo id để update lấy ra đối tượng thông qua id

    Account findById(int id);

    // Thêm mới hoặc update





    // Xoá
}
