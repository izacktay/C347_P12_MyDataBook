package sg.edu.rp.c347.c347_p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {

    Button btnEdit;
    TextView tv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bio, container, false);

        tv = (TextView) view.findViewById(R.id.textView);
        btnEdit = (Button) view.findViewById(R.id.buttonEdit);


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LayoutInflater inflate1 = LayoutInflater.from(getContext());


                LinearLayout passPhrase =
                        (LinearLayout) inflate1.inflate(R.layout.pass_phrase, null);
                final EditText etPassphrase = (EditText) passPhrase.findViewById(R.id.editTextPassPhrase);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Please Enter")
                        .setView(passPhrase)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //This is to get the text from the Passphrase and display a toast message.
                                Toast.makeText(getContext(), "You had entered " +
                                        etPassphrase.getText().toString(), Toast.LENGTH_LONG).show();

                                tv.setText(etPassphrase.getText().toString());

                            }
                        })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "You clicked cancle", Toast.LENGTH_LONG).show();

                    }
                });



                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

        });

        return view;

    }



}
