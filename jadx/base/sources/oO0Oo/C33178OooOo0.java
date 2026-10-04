package oO0Oo;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import o0o0OO0.C30394OooOOOO;
import oO0OO.C32879OooO0Oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: oO0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33178OooOo0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120069OooOo0o;

    public C33178OooOo0(TextRecognizeFragment textRecognizeFragment) {
        this.f120069OooOo0o = textRecognizeFragment;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        TextRecognizeFragment textRecognizeFragment = this.f120069OooOo0o;
        Spinner spinner = textRecognizeFragment.f78174Oooo0o;
        if (spinner == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("langSelector");
            throw null;
        }
        Object selectedItem = spinner.getSelectedItem();
        kotlin.jvm.internal.OooOOO0.OooO0o0(selectedItem, "null cannot be cast to non-null type com.orion.notein.ui.ocr.adapter.LanguageVO");
        C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
        Integer numValueOf = Integer.valueOf(((C32879OooO0Oo) selectedItem).f117992OooO00o);
        C33781o00o0O c33781o00o0O = c30394OooOOOOOooo00O.f108515OooOoOO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
