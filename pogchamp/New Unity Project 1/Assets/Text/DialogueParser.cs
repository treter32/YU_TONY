using UnityEngine;
using System.Collections;
using UnityEditor;
using System.Text;
using System.IO;
using System.Text.RegularExpressions;
using System.Collections.Generic;

public class DialogueParser : MonoBehaviour 
{
	struct DialogueLine
	{
		public string name;
		public string content;
		public int pose;
		public string position;
		public string[] options;

		public DialogueLine(string Name, string Content, int Pose, string Position)
		{
			name = Name;
			content = Content;
			pose = Pose;
			position = Position;
			options = new string[0];
		}
	}

	List<DialogueLine> lines;

	void Start ()
	{
		string file = "Assets/Text/Dialogue";
		string sceneNum = EditorApplication.currentScene;
		sceneNum = Regex.Replace (sceneNum, "[^0-9]", "");
		file += sceneNum;
		file += ".txt";
		lines = new List<DialogueLine> ();
		LoadDialogue (file);


	}
		
	void Update () 
	{
	
	}

	void LoadDialogue(string filename)
	{
		string line;
		StreamReader r = new StreamReader (filename);
			
		using (r)
		{
			do 
			{
				line = r.ReadLine();
				if (lines !=null)
				{
					string[] lineData = line.Split('-');
					if(lineData[0] == "Player")
					{
						DialogueLine lineEntry = new DialogueLine(lineData[0], "", 0, "");
						lineEntry.options = new string[lineData.Length-1];
					}
					
				}
			}
		}
				

	}
}


