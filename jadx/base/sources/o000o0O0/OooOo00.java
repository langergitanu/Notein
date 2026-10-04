package o000o0O0;

import OooO0o.C20424OooO0Oo;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.TaskStackBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24585OooOoO0;
import o000o0O0.C24585OooOoO0.OooO0O0;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f83287OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Intent f83288OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24585OooOoO0 f83289OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f83290OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f83291OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Bundle f83292OooO0O0;

        public OooO00o(int i, Bundle bundle) {
            this.f83291OooO00o = i;
            this.f83292OooO0O0 = bundle;
        }
    }

    public OooOo00(C24572OooOO0o navController) {
        Intent launchIntentForPackage;
        kotlin.jvm.internal.OooOOO0.OooO0oO(navController, "navController");
        Context context = navController.f83207OooO00o;
        this.f83287OooO00o = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f83288OooO0O0 = launchIntentForPackage;
        this.f83290OooO0Oo = new ArrayList();
        this.f83289OooO0OO = navController.OooO();
    }

    public final TaskStackBuilder OooO00o() {
        C24585OooOoO0 c24585OooOoO0 = this.f83289OooO0OO;
        if (c24585OooOoO0 == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = this.f83290OooO0Oo;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        C24583OooOo0o c24583OooOo0o = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = this.f83287OooO00o;
            int i = 0;
            if (!zHasNext) {
                int[] iArrO00oO0O = oOo000Oo.OooOo.o00oO0O(arrayList2);
                Intent intent = this.f83288OooO0O0;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrO00oO0O);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(context).addNextIntentWithParentStack(new Intent(intent));
                kotlin.jvm.internal.OooOOO0.OooO0o(taskStackBuilderAddNextIntentWithParentStack, "create(context)\n        …rentStack(Intent(intent))");
                int intentCount = taskStackBuilderAddNextIntentWithParentStack.getIntentCount();
                while (i < intentCount) {
                    Intent intentEditIntentAt = taskStackBuilderAddNextIntentWithParentStack.editIntentAt(i);
                    if (intentEditIntentAt != null) {
                        intentEditIntentAt.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return taskStackBuilderAddNextIntentWithParentStack;
            }
            OooO00o oooO00o = (OooO00o) it.next();
            int i2 = oooO00o.f83291OooO00o;
            C24583OooOo0o c24583OooOo0oOooO0O0 = OooO0O0(i2);
            if (c24583OooOo0oOooO0O0 == null) {
                int i3 = C24583OooOo0o.f83294Oooo000;
                throw new IllegalArgumentException("Navigation destination " + C24583OooOo0o.OooO00o.OooO00o(context, i2) + " cannot be found in the navigation graph " + c24585OooOoO0);
            }
            int[] iArrOooO0o0 = c24583OooOo0oOooO0O0.OooO0o0(c24583OooOo0o);
            int length = iArrOooO0o0.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(iArrOooO0o0[i]));
                arrayList3.add(oooO00o.f83292OooO0O0);
                i++;
            }
            c24583OooOo0o = c24583OooOo0oOooO0O0;
        }
    }

    public final C24583OooOo0o OooO0O0(int i) {
        C34426OooOO0o c34426OooOO0o = new C34426OooOO0o();
        C24585OooOoO0 c24585OooOoO0 = this.f83289OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c24585OooOoO0);
        c34426OooOO0o.addLast(c24585OooOoO0);
        while (!c34426OooOO0o.isEmpty()) {
            C24583OooOo0o c24583OooOo0o = (C24583OooOo0o) c34426OooOO0o.removeFirst();
            if (c24583OooOo0o.f83302OooOooO == i) {
                return c24583OooOo0o;
            }
            if (c24583OooOo0o instanceof C24585OooOoO0) {
                C24585OooOoO0.OooO0O0 oooO0O0 = ((C24585OooOoO0) c24583OooOo0o).new OooO0O0();
                while (oooO0O0.hasNext()) {
                    c34426OooOO0o.addLast((C24583OooOo0o) oooO0O0.next());
                }
            }
        }
        return null;
    }

    public final void OooO0OO() {
        Iterator it = this.f83290OooO0Oo.iterator();
        while (it.hasNext()) {
            int i = ((OooO00o) it.next()).f83291OooO00o;
            if (OooO0O0(i) == null) {
                int i2 = C24583OooOo0o.f83294Oooo000;
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Navigation destination ", C24583OooOo0o.OooO00o.OooO00o(this.f83287OooO00o, i), " cannot be found in the navigation graph ");
                sbOooO0o0.append(this.f83289OooO0OO);
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
        }
    }
}
