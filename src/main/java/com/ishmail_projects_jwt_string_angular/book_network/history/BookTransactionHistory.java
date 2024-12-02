package com.ishmail_projects_jwt_string_angular.book_network.history;


import com.ishmail_projects_jwt_string_angular.book_network.book.Book;
import com.ishmail_projects_jwt_string_angular.book_network.common.BaseEntity;
import com.ishmail_projects_jwt_string_angular.book_network.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionHistory extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private boolean returned;
    private boolean returnApproved;
}
