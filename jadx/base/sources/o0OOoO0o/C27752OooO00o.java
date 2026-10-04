package o0OOoO0o;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.MimeTypeFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import java.util.Locale;
import java.util.Map;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OOoO0o.C27755OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOoO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27752OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f97983OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f97984OooOo0o;

    public /* synthetic */ C27752OooO00o(Object obj, int i) {
        this.f97984OooOo0o = i;
        this.f97983OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String mimeTypeFromExtension;
        switch (this.f97984OooOo0o) {
            case 0:
                C27755OooO0Oo c27755OooO0Oo = (C27755OooO0Oo) this.f97983OooOo;
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(entry, "<destruct>");
                String str = (String) entry.getKey();
                C27755OooO0Oo.OooO0O0 oooO0O0 = (C27755OooO0Oo.OooO0O0) entry.getValue();
                return Boolean.valueOf((c27755OooO0Oo.f97993OooO0oO.contains(str) || oooO0O0.f98004OooO00o.isEmpty() || (oooO0O0.f98005OooO0O0 != null && oooO0O0.f98005OooO0O0 != C27755OooO0Oo.EnumC27756OooO0o0.f98021OooOo0o)) ? false : true);
            case 1:
                Uri uri = (Uri) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                    mimeTypeFromExtension = ((AudioBarChildFragment) this.f97983OooOo).requireContext().getContentResolver().getType(uri);
                } else {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(fileExtensionFromUrl);
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.OooOOO0.OooO0o(locale, "getDefault(...)");
                    String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                    kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                    mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                }
                return Boolean.valueOf(MimeTypeFilter.matches(mimeTypeFromExtension, "audio/*"));
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT COUNT(*) FROM ImageEntity WHERE layer_id = ?");
                String str2 = (String) this.f97983OooOo;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    Long lValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
