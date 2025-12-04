package org.ooad.library.notification;

import org.ooad.library.book.BookItem;
import org.ooad.library.contact.User;

public interface Notification {
    public void sendNotification(User member, BookItem bookItem);
}
