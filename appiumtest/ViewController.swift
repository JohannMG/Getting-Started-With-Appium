//
//  ViewController.swift
//  appiumtest
//
//  Created by Garces, Johann (TEKsystems) on 2/11/16.
//  Copyright © 2016 aaa.johannmg. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var autofillTextField: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func buttonPushed(sender: UIButton) {
        
        autofillTextField.text = "Hello"
        
    }
    
    @IBAction func clearTextAction(sender: UIButton) {
        autofillTextField.text = ""
    }
    

}

