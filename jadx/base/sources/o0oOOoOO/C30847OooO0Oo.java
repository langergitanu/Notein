package o0oOOoOO;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.microsoft.identity.client.internal.MsalUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo.C25086OooOo0O;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33595OooOOo;
import oO0oO0O.InterfaceC34008OooO0O0;
import oO0oO0O.ViewTreeObserverOnGlobalLayoutListenerC34007OooO00o;

/* JADX INFO: renamed from: o0oOOoOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30847OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f110255OooO00o = 0;

    public static C25086OooOo0O OooO00o(Activity activity, InterfaceC34008OooO0O0 interfaceC34008OooO0O0) {
        if (activity == null) {
            throw new NullPointerException("Parameter:activity must not be null");
        }
        Window window = activity.getWindow();
        OooOOO0.OooO0o(window, "activity.window");
        if ((window.getAttributes().softInputMode & 48) == 48) {
            throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
        }
        if (interfaceC34008OooO0O0 == null) {
            throw new NullPointerException("Parameter:listener must not be null");
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        OooOOO0.OooO0o(viewFindViewById, "activity.findViewById(android.R.id.content)");
        View rootView = ((ViewGroup) viewFindViewById).getRootView();
        OooOOO0.OooO0o(rootView, "getContentRoot(activity).rootView");
        ViewTreeObserverOnGlobalLayoutListenerC34007OooO00o viewTreeObserverOnGlobalLayoutListenerC34007OooO00o = new ViewTreeObserverOnGlobalLayoutListenerC34007OooO00o(activity, interfaceC34008OooO0O0);
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC34007OooO00o);
        OooOOO0.OooO0oO(activity, "activity");
        C25086OooOo0O c25086OooOo0O = new C25086OooOo0O();
        c25086OooOo0O.f85155OooO00o = new WeakReference(activity);
        c25086OooOo0O.f85156OooO0O0 = new WeakReference(viewTreeObserverOnGlobalLayoutListenerC34007OooO00o);
        return c25086OooOo0O;
    }

    public static final String OooO0O0(C33479OooO0o c33479OooO0o) {
        OooOOO0.OooO0oO(c33479OooO0o, "<this>");
        String strOooO0O0 = c33479OooO0o.OooO0O0();
        OooOOO0.OooO0o(strOooO0O0, "asString()");
        if (!oO0OOOO.OooOOO0.f119040OooO00o.contains(strOooO0O0)) {
            for (int i = 0; i < strOooO0O0.length(); i++) {
                char cCharAt = strOooO0O0.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strOooO0O02 = c33479OooO0o.OooO0O0();
            OooOOO0.OooO0o(strOooO0O02, "asString()");
            return strOooO0O02;
        }
        StringBuilder sb = new StringBuilder();
        String strOooO0O03 = c33479OooO0o.OooO0O0();
        OooOOO0.OooO0o(strOooO0O03, "asString()");
        sb.append("`".concat(strOooO0O03));
        sb.append('`');
        return sb.toString();
    }

    public static final String OooO0OO(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C33479OooO0o c33479OooO0o = (C33479OooO0o) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(OooO0O0(c33479OooO0o));
        }
        String string = sb.toString();
        OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String OooO0Oo(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        OooOOO0.OooO0oO(lowerRendered, "lowerRendered");
        OooOOO0.OooO0oO(lowerPrefix, "lowerPrefix");
        OooOOO0.OooO0oO(upperRendered, "upperRendered");
        OooOOO0.OooO0oO(upperPrefix, "upperPrefix");
        OooOOO0.OooO0oO(foldedPrefix, "foldedPrefix");
        if (!C33595OooOOo.OooOoO0(lowerRendered, lowerPrefix, false) || !C33595OooOOo.OooOoO0(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!OooO0o0(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final void OooO0o(ByteBuffer byteBuffer, ByteBuffer other) {
        OooOOO0.OooO0oO(other, "other");
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = other.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i = 0; i < iRemaining2; i++) {
            byteBufferSlice.put(i, (byte) (byteBufferSlice.get(i) ^ byteBufferSlice2.get(i % iRemaining)));
        }
    }

    public static final boolean OooO0o0(String lower, String upper) {
        OooOOO0.OooO0oO(lower, "lower");
        OooOOO0.OooO0oO(upper, "upper");
        if (lower.equals(C33595OooOOo.OooOo0O(upper, MsalUtils.QUERY_STRING_SYMBOL, ""))) {
            return true;
        }
        if (C33595OooOOo.OooOOo0(upper, MsalUtils.QUERY_STRING_SYMBOL, false) && OooOOO0.OooO0O0(lower.concat(MsalUtils.QUERY_STRING_SYMBOL), upper)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return OooOOO0.OooO0O0(sb.toString(), upper);
    }
}
