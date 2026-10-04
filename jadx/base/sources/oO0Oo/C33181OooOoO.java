package oO0Oo;

import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;

/* JADX INFO: renamed from: oO0Oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33181OooOoO extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120080OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f120081OooO0O0;

    public C33181OooOoO(TextRecognizeFragment textRecognizeFragment, String str) {
        this.f120080OooO00o = textRecognizeFragment;
        this.f120081OooO0O0 = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(url, "url");
        TextRecognizeFragment textRecognizeFragment = this.f120080OooO00o;
        ActivityC21897OooOo0 activity = textRecognizeFragment.getActivity();
        Object systemService = activity != null ? activity.getSystemService("print") : null;
        PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
        if (printManager != null) {
            String str = this.f120081OooO0O0;
            PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = view.createPrintDocumentAdapter(str);
            kotlin.jvm.internal.OooOOO0.OooO0o(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(...)");
            PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.ISO_A4).build();
            kotlin.jvm.internal.OooOOO0.OooO0o(printAttributesBuild, "build(...)");
            printManager.print(str, printDocumentAdapterCreatePrintDocumentAdapter, printAttributesBuild);
        }
        textRecognizeFragment.getClass();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        return false;
    }
}
