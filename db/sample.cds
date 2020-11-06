namespace my;

entity Authors{
key ID: Integer;
name: String;
book:Association to many Books on book.author=$self;
}

entity Books{
key ID: Integer;
title: String;
stock: Integer;
author:Association to Authors;
}