package o000o0O0;

import Oooo0oO.C21023OooO0Oo;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import com.aspose.words.WarningType;
import com.huawei.hms.network.embedded.C18361t4;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import o000o0O0.Oooo0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o000o0O0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Oooo0.OooO00o(C18361t4.f56218b)
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Lo000o0O0/OooO0O0;", "Lo000o0O0/Oooo0;", "Lo000o0O0/OooO0O0$OooO00o;", "OooO00o", "navigation-runtime_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class C24565OooO0O0 extends Oooo0<OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f83174OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Activity f83175OooO0Oo;

    /* JADX INFO: renamed from: o000o0O0.OooO0O0$OooO00o */
    public static class OooO00o extends C24583OooOo0o {

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public Intent f83176Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public String f83177Oooo00o;

        public OooO00o() {
            throw null;
        }

        @Override // o000o0O0.C24583OooOo0o
        public final void OooO0oo(Context context, AttributeSet attributeSet) {
            super.OooO0oo(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C24603Oooo0oO.f83373OooO00o);
            kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(4);
            if (string != null) {
                String packageName = context.getPackageName();
                kotlin.jvm.internal.OooOOO0.OooO0o(packageName, "context.packageName");
                string = C33595OooOOo.OooOo0O(string, "${applicationId}", packageName);
            }
            if (this.f83176Oooo00O == null) {
                this.f83176Oooo00O = new Intent();
            }
            Intent intent = this.f83176Oooo00O;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(intent);
            intent.setPackage(string);
            String string2 = typedArrayObtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f83176Oooo00O == null) {
                    this.f83176Oooo00O = new Intent();
                }
                Intent intent2 = this.f83176Oooo00O;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(intent2);
                intent2.setComponent(componentName);
            }
            String string3 = typedArrayObtainAttributes.getString(1);
            if (this.f83176Oooo00O == null) {
                this.f83176Oooo00O = new Intent();
            }
            Intent intent3 = this.f83176Oooo00O;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(intent3);
            intent3.setAction(string3);
            String string4 = typedArrayObtainAttributes.getString(2);
            if (string4 != null) {
                Uri uri = Uri.parse(string4);
                if (this.f83176Oooo00O == null) {
                    this.f83176Oooo00O = new Intent();
                }
                Intent intent4 = this.f83176Oooo00O;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(intent4);
                intent4.setData(uri);
            }
            this.f83177Oooo00o = typedArrayObtainAttributes.getString(3);
            typedArrayObtainAttributes.recycle();
        }

        @Override // o000o0O0.C24583OooOo0o
        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof OooO00o) && super.equals(obj)) {
                Intent intent = this.f83176Oooo00O;
                if ((intent != null ? intent.filterEquals(((OooO00o) obj).f83176Oooo00O) : ((OooO00o) obj).f83176Oooo00O == null) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83177Oooo00o, ((OooO00o) obj).f83177Oooo00o)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o000o0O0.C24583OooOo0o
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f83176Oooo00O;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f83177Oooo00o;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // o000o0O0.C24583OooOo0o
        public final String toString() {
            Intent intent = this.f83176Oooo00O;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.f83176Oooo00O;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String string = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19636OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Context, Context> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C19636OooO0O0 f83178OooOo0o = new C19636OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Context invoke(Context context) {
            Context it = context;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C24565OooO0O0(Context context) {
        Object next;
        this.f83174OooO0OO = context;
        Iterator it = C33574OooOOO0.OooO(context, C19636OooO0O0.f83178OooOo0o).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f83175OooO0Oo = (Activity) next;
    }

    @Override // o000o0O0.Oooo0
    public final C24583OooOo0o OooO00o() {
        return new OooO00o(this);
    }

    @Override // o000o0O0.Oooo0
    public final C24583OooOo0o OooO0OO(C24583OooOo0o c24583OooOo0o, Bundle bundle, C24587OooOoo c24587OooOoo) {
        Intent intent;
        int intExtra;
        OooO00o oooO00o = (OooO00o) c24583OooOo0o;
        if (oooO00o.f83176Oooo00O == null) {
            throw new IllegalStateException(C21023OooO0Oo.OooO0OO(" does not have an Intent set.", oooO00o.f83302OooOooO, new StringBuilder("Destination ")).toString());
        }
        Intent intent2 = new Intent(oooO00o.f83176Oooo00O);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = oooO00o.f83177Oooo00o;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f83175OooO0Oo;
        if (activity == null) {
            intent2.addFlags(WarningType.HINT);
        }
        if (c24587OooOoo != null && c24587OooOoo.f83319OooO00o) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", oooO00o.f83302OooOooO);
        Context context = this.f83174OooO0OO;
        Resources resources = context.getResources();
        if (c24587OooOoo != null) {
            int i = c24587OooOoo.f83326OooO0oo;
            int i2 = c24587OooOoo.f83318OooO;
            if ((i <= 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + oooO00o);
            }
        }
        context.startActivity(intent2);
        if (c24587OooOoo == null || activity == null) {
            return null;
        }
        int i3 = c24587OooOoo.f83323OooO0o;
        int i4 = c24587OooOoo.f83325OooO0oO;
        if ((i3 <= 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(resources.getResourceTypeName(i3), "animator")) && (i4 <= 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(resources.getResourceTypeName(i4), "animator"))) {
            if (i3 < 0 && i4 < 0) {
                return null;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + oooO00o);
        return null;
    }

    @Override // o000o0O0.Oooo0
    public final boolean OooOO0() {
        Activity activity = this.f83175OooO0Oo;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
