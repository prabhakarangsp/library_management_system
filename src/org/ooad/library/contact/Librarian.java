package org.ooad.library.contact;

import org.ooad.library.book.BookItem;
import org.ooad.library.enums.AccountStatus;

public class Librarian extends User {

    public void addBookItem(BookItem bookItem) {

    }

    public void blockMember(User member) {
        member.setAccountStatus(AccountStatus.BLACKLISTED);
    }

    public void unblockMember(User member) {
        member.setAccountStatus(AccountStatus.ACTIVE);
    }
}
