package kielce.hackathon.pl.appka;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JakGlosowacFragment extends Fragment {

    private TextView mHeader;
    private TextView mInfo;
    private TextView mInfo2;
    private TextView mInfo3;

    private TextView mHeaderGdzie;
    private TextView mGdyrozne;
    private TextView mGdyrozne2;
    private TextView mGdyrozne3;

    public JakGlosowacFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mHeader = (TextView)view.findViewById(R.id.jakGlosFrag_header_tv);
        mInfo = (TextView)view.findViewById(R.id.jakGlosFrag_info_tv);
        mInfo2 = (TextView)view.findViewById(R.id.jakGlosFrag_info2_tv);
        mInfo3 = (TextView)view.findViewById(R.id.jakGlosFrag_info3_tv);

        mHeaderGdzie = (TextView)view.findViewById(R.id.gdzie_header_tv);
        mGdyrozne =(TextView)view.findViewById(R.id.Gdyrozne_info_tv) ;
        mGdyrozne2 =(TextView)view.findViewById(R.id.Gdyrozne_info2_tv) ;
        mGdyrozne3 =(TextView)view.findViewById(R.id.Gdyrozne_info3_tv) ;

        mHeader.setText("Kto może zagłosować");
        mHeader.setTypeface(null, Typeface.BOLD);
        mInfo.setText("\u2022   obywatel polski, który najpóźniej w dniu głosowania kończy 18 lat, oraz stale zamieszkuje na obszarze, odpowiednio, tego powiatu i województwa\n");
        mInfo2.setText("\u2022   Na wójta, burmistrza czy prezydenta danego miasta głosować mogą stale zamieszkujący dany obszar. Kryterium wieku nie ulega zmianie.\n");
        mInfo3.setText("\u2022   Jednakże istnieją także osoby, które nie mogą głosować pomimo ukończonych 18 lat. Są to ludzie którym odebrano prawa publiczne i/lub ubezwłasnowolniono na skutek prawomocnego orzeczenia sądu oraz ci bez praw wyborczych, o czym zadecydował Trybunał Stanu.\n");


        mHeaderGdzie.setText("Co jeśli miejsce zamieszkania jest różne z zameldowaniem");
        mHeaderGdzie.setTypeface(null, Typeface.BOLD);

        mGdyrozne.setText("\u2022  Po pierwsze w urzędzie danej gminy trzeba złożyć wniosek zawierający dane osobowe wnioskującego – imię, nazwisko, imię ojca, datę urodzenia i PESEL");
        mGdyrozne2.setText("\u2022 Do wniosku trzeba załączyć: kserokopię ważnego dowodu tożsamości oraz pisemną deklarację z informacją o obywatelstwie i adresie stałego zamieszkania w Polsce");
        mGdyrozne3.setText("\u2022 W ciągu kolejnych 3 dni po złożeniu wniosku podjęta zostaje decyzja (przez burmistrza lub prezydenta miasta), czy wnioskodawca zostanie wpisane do rejestru wyborców, czy też nie. W przypadku pozytywnej odpowiedzi, jest on uprawniony do głosowania na wybranym przez niego terenie.");

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jak_glosowac, container, false);
    }

}
