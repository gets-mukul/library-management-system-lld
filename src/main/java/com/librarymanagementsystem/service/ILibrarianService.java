package com.librarymanagementsystem.service;

import com.librarymanagementsystem.model.Member;

public interface ILibrarianService {

    public boolean addBookItem();

    public boolean blockMember(Member member);

    public boolean unBlockMember(Member member);

}
