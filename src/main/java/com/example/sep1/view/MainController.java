package com.example.sep1.view;

import com.example.sep1.viewmodel.MainViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController
{
  @FXML private Label welcomeText;
  @FXML private TextField nameTextField, birthdayTextField;

  private MainViewModel mainViewModel;

  @FXML
  protected void init()
  {
    mainViewModel = new MainViewModel();
  }
  @FXML protected void onAddAnimalForSaleClick()
  {
    mainViewModel.addAnimalForSale(nameTextField.getText(), birthdayTextField.getText());
  }
}