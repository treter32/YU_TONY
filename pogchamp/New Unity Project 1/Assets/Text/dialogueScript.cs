using UnityEngine;
using System.Collections;
using UnityEngine.UI;
public class dialogueScript : MonoBehaviour 
{
	public thonk scriptThonk;
	Text txt;
	string dialogueCancer;
	public TextAsset asset;

	void Start()
	{
		txt = GetComponent <Text> ();
		txt.text = "";
	}


	void Update()
	{
		
		txt.text = asset.text;


	}


}