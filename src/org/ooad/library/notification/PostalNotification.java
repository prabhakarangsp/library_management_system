package org.ooad.library.notification;

import org.ooad.library.book.BookItem;
import org.ooad.library.contact.User;

public class PostalNotification implements Notification {
    @Override
    public void sendNotification(User member, BookItem bookItem) {
        System.out.println("going to send postal notification to the user " + member.getName() + " for the book " + bookItem.getBookName());
    }
}
