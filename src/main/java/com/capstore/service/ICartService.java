package com.capstore.service;

import java.util.List;

import com.capstore.model.Cart;

public interface ICartService {

	List<Cart> deleteCartProduct(int productId);

}