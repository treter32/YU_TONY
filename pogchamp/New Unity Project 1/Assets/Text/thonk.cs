using UnityEngine;
using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using System.IO;
public class thonk : MonoBehaviour 
{
	
	Text txt;
	string dialogueCancer;
	public TextAsset asset;
	public TextAsset asset2;
	public TextAsset asset3;
	public int diaNum  = 1;
	public bool done = false;
	// Use this for initialization
	void Start () 
	{
		txt = GetComponent<Text> ();
		dialogueCancer = asset.text;
		txt.text = "";
		StartCoroutine ("PlayText");
	}
	
	 

	void Update ()
	{
		if (done == true) 
		{
			if (Input.GetKeyDown ("space")) 
			{
				diaNum = diaNum + 1;
				txt.text = "";
				dialogueCancer = asset2.text;
				StartCoroutine ("PlayText");
			}
			done = false;
		}

	}
	IEnumerator PlayText()
	{
		foreach (char c in dialogueCancer) //itsuki+takumi
		{
			
				txt.text += c;

			yield return new WaitForSeconds (0.025f); //E
		}
		done = true;
	}

}
