using UnityEngine;
using System.Collections;
using UnityEngine.UI;
using System.Collections.Generic;

public class dialogueManager : MonoBehaviour 
{
	dialogueScript parser;

	public string dialogue, characterName;
	public int lineNum;
	int pose;
	string position;
	string[] options;
	public bool playerTalking;
	List<Button> buttons = new List<Button> ();

	public Text dialogueBox;
	public Text nameBox;
	public GameObject choiceBox;

	// Use this for initialization
	void Start () 
	{
	
	}
	
	// Update is called once per frame
	void Update () 
	{
	
	}
}
