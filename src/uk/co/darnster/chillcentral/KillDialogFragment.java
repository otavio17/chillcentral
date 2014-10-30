package uk.co.darnster.chillcentral;
/*
* 16/7/13 - String abstraction complete
*
*
*/

import android.app.DialogFragment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class KillDialogFragment extends DialogFragment {
	static Context mContext;
	
	public KillDialogFragment (Context context) {
		mContext = context;
	}
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		super.onCreateDialog(savedInstanceState);
    	//Integer theme =  R.style.MyDialog;
        return new AlertDialog.Builder(getActivity())
        .setIcon(R.drawable.ic_launcher)
        .setTitle(mContext.getString(R.string.exit) + " " + mContext.getString(R.string.app_name) )
        .setMessage(mContext.getString(R.string.app_close) +  " " + mContext.getString(R.string.app_name)).setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    	dialog.dismiss();
                    	android.os.Process.killProcess( android.os.Process.myPid() ) ;   	
                }})
                .setNegativeButton(R.string.cancel, null).create();
    } 
}  
        

