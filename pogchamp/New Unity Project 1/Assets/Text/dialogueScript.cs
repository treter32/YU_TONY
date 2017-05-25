using UnityEngine;
using System.Collections;
using UnityEngine.UI;
public class dialogueScript : MonoBehaviour 
{
	Text text;
	public TextAsset asset;
	void Start() 
	{
		print (asset.text);
	}

	void Awake()
	{
		text = GetComponent <Text> ();
	}

	void Update()
	{
		text.text = asset.text;
	}
}