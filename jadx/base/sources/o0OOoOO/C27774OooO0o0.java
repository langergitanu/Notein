package o0OOoOO;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OoO0oo.C28691OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o0OOoOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27774OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f98111OooO00o;

    public C27774OooO0o0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f98111OooO00o = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (r15 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d9 -> B:34:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27772OooO0OO c27772OooO0OO;
        Collection arrayList;
        Iterator it;
        C27774OooO0o0 c27774OooO0o0;
        Collection collection;
        Iterator it2;
        C27774OooO0o0 c27774OooO0o02;
        String str2;
        String str3;
        List list2;
        if (abstractC32479OooO0OO instanceof C27772OooO0OO) {
            c27772OooO0OO = (C27772OooO0OO) abstractC32479OooO0OO;
            int i = c27772OooO0OO.f98105OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27772OooO0OO.f98105OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27772OooO0OO = new C27772OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27772OooO0OO.f98104OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27772OooO0OO.f98105OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            arrayList = new ArrayList();
            it = list.iterator();
            c27774OooO0o0 = this;
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            it2 = c27772OooO0OO.f98102OooOoO;
            collection = c27772OooO0OO.f98103OooOoO0;
            str2 = c27772OooO0OO.f98100OooOo;
            c27774OooO0o02 = c27772OooO0OO.f98101OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            str3 = (String) objOooO0o;
            if (str3 != null) {
            }
        } else if (i2 == 2) {
            it2 = c27772OooO0OO.f98102OooOoO;
            collection = c27772OooO0OO.f98103OooOoO0;
            str2 = c27772OooO0OO.f98100OooOo;
            c27774OooO0o02 = c27772OooO0OO.f98101OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            list2 = (List) objOooO0o;
            Collection collection2 = collection;
            it = it2;
            str = str2;
            C27772OooO0OO c27772OooO0OO2 = c27772OooO0OO;
            C34431OooOo0.OooOo0o(collection2, list2);
            arrayList = collection2;
            c27772OooO0OO = c27772OooO0OO2;
            c27774OooO0o0 = c27774OooO0o02;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = c27772OooO0OO.f98102OooOoO;
            collection = c27772OooO0OO.f98103OooOoO0;
            str2 = c27772OooO0OO.f98100OooOo;
            c27774OooO0o02 = c27772OooO0OO.f98101OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            list2 = (List) objOooO0o;
            Collection collection22 = collection;
            it = it2;
            str = str2;
            C27772OooO0OO c27772OooO0OO22 = c27772OooO0OO;
            C34431OooOo0.OooOo0o(collection22, list2);
            arrayList = collection22;
            c27772OooO0OO = c27772OooO0OO22;
            c27774OooO0o0 = c27774OooO0o02;
            if (!it.hasNext()) {
                Uri uri = (Uri) it.next();
                AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27774OooO0o0.f98111OooO00o;
                c27772OooO0OO.f98101OooOo0o = c27774OooO0o0;
                c27772OooO0OO.f98100OooOo = str;
                c27772OooO0OO.f98103OooOoO0 = arrayList;
                c27772OooO0OO.f98102OooOoO = it;
                c27772OooO0OO.f98105OooOoo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28691OooO0oO(abstractApplicationC26277OooOoOO, uri, null), c27772OooO0OO);
                if (objOooO0o2 != enumC32485OooO00o) {
                    C27774OooO0o0 c27774OooO0o03 = c27774OooO0o0;
                    str2 = str;
                    it2 = it;
                    collection = arrayList;
                    objOooO0o = objOooO0o2;
                    c27774OooO0o02 = c27774OooO0o03;
                    str3 = (String) objOooO0o;
                    if (str3 != null) {
                        throw new IllegalArgumentException();
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str3, options);
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    c27774OooO0o02.getClass();
                    if (i4 <= i3 || i4 / i3 < 2.0f) {
                        c27772OooO0OO.f98101OooOo0o = c27774OooO0o02;
                        c27772OooO0OO.f98100OooOo = str2;
                        c27772OooO0OO.f98103OooOoO0 = collection;
                        c27772OooO0OO.f98102OooOoO = it2;
                        c27772OooO0OO.f98105OooOoo = 2;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27770OooO00o(str3, str2, null), c27772OooO0OO);
                        if (objOooO0o3 != enumC32485OooO00o) {
                            list2 = (List) objOooO0o3;
                            Collection collection222 = collection;
                            it = it2;
                            str = str2;
                            C27772OooO0OO c27772OooO0OO222 = c27772OooO0OO;
                            C34431OooOo0.OooOo0o(collection222, list2);
                            arrayList = collection222;
                            c27772OooO0OO = c27772OooO0OO222;
                            c27774OooO0o0 = c27774OooO0o02;
                            if (!it.hasNext()) {
                                List list3 = (List) arrayList;
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    ((Page) it3.next()).setSource(2);
                                }
                                return list3;
                            }
                        }
                    } else {
                        c27772OooO0OO.f98101OooOo0o = c27774OooO0o02;
                        c27772OooO0OO.f98100OooOo = str2;
                        c27772OooO0OO.f98103OooOoO0 = collection;
                        c27772OooO0OO.f98102OooOoO = it2;
                        c27772OooO0OO.f98105OooOoo = 3;
                        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27771OooO0O0(str3, c27774OooO0o02, str2, null), c27772OooO0OO);
                    }
                }
                return enumC32485OooO00o;
            }
        }
    }
}
