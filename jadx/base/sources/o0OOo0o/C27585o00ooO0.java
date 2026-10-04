package o0OOo0o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.INoteinDisplayItem;
import com.orion.notein.domain.models.page.LayeredDisplayItems;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.PaperSpec;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26264OooOOO0;
import o0OO.C26427Oooo0O0;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26681o00o0oOO;
import o0OOO0OO.C27009OooO0oO;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOoooO.C28009OooOOOO;
import o0oo000O.C31192OooOOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00ooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27585o00ooO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C28009OooOOOO f96833OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f96834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26596o00O0o0 f96835OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26264OooOOO0 f96836OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26515OooooO0 f96837OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C26649o00OoooO f96838OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C24378OooOoO0 f96839OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27020OooOoO0 f96840OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C26427Oooo0O0 f96841OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27129OoooOOO f96842OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f96843OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final InterfaceC27309OooOoO f96844OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC27318Oooo00o f96845OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C26681o00o0oOO f96846OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC27301OooOOo f96847OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96848OooOOOo;

    public C27585o00ooO0(InterfaceC27323Oooo0oO strokeRepo, C26596o00O0o0 c26596o00O0o0, C26264OooOOO0 c26264OooOOO0, C26515OooooO0 c26515OooooO0, C24378OooOoO0 c24378OooOoO0, C26649o00OoooO c26649o00OoooO, C27020OooOoO0 c27020OooOoO0, C26427Oooo0O0 c26427Oooo0O0, C28009OooOOOO c28009OooOOOO, C27129OoooOOO c27129OoooOOO, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo, C26681o00o0oOO c26681o00o0oOO, InterfaceC27318Oooo00o pageLayerRepo, InterfaceC27301OooOOo hyperLinkRepo, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerRepo, "pageLayerRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(hyperLinkRepo, "hyperLinkRepo");
        this.f96834OooO00o = strokeRepo;
        this.f96835OooO0O0 = c26596o00O0o0;
        this.f96836OooO0OO = c26264OooOOO0;
        this.f96837OooO0Oo = c26515OooooO0;
        this.f96839OooO0o0 = c24378OooOoO0;
        this.f96838OooO0o = c26649o00OoooO;
        this.f96840OooO0oO = c27020OooOoO0;
        this.f96841OooO0oo = c26427Oooo0O0;
        this.f96833OooO = c28009OooOOOO;
        this.f96842OooOO0 = c27129OoooOOO;
        this.f96843OooOO0O = noteMetaRepo;
        this.f96844OooOO0o = noteContentRepo;
        this.f96846OooOOO0 = c26681o00o0oOO;
        this.f96845OooOOO = pageLayerRepo;
        this.f96847OooOOOO = hyperLinkRepo;
        this.f96848OooOOOo = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.OooO0oo(r7, (java.util.List) r8, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27573o00oo c27573o00oo;
        C27585o00ooO0 c27585o00ooO0;
        Folder folder;
        if (abstractC32479OooO0OO instanceof C27573o00oo) {
            c27573o00oo = (C27573o00oo) abstractC32479OooO0OO;
            int i = c27573o00oo.f96766OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27573o00oo.f96766OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27573o00oo = new C27573o00oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27573o00oo.f96765OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27573o00oo.f96766OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            c27573o00oo.f96763OooOo0o = this;
            c27573o00oo.f96766OooOoOO = 1;
            objOooO0Oo = this.f96833OooO.OooO0Oo(str);
            if (objOooO0Oo != obj) {
                c27585o00ooO0 = this;
            }
            return obj;
        }
        if (i2 == 1) {
            C27585o00ooO0 c27585o00ooO02 = c27573o00oo.f96763OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27585o00ooO0 = c27585o00ooO02;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                return C32460OooOooO.f116667OooO00o;
            }
            folder = c27573o00oo.f96762OooOo;
            c27585o00ooO0 = c27573o00oo.f96763OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27573o00oo.f96763OooOo0o = null;
            c27573o00oo.f96762OooOo = null;
            c27573o00oo.f96766OooOoOO = 3;
        }
        folder = (Folder) objOooO0Oo;
        if (folder != null) {
            String strOooO0Oo = c27585o00ooO0.f96842OooOO0.OooO0Oo();
            String id = folder.getId();
            c27573o00oo.f96763OooOo0o = c27585o00ooO0;
            c27573o00oo.f96762OooOo = folder;
            c27573o00oo.f96766OooOoOO = 2;
            objOooO0Oo = c27585o00ooO0.f96843OooOO0O.OooOOoo(id, strOooO0Oo, c27573o00oo);
            if (objOooO0Oo != obj) {
                c27573o00oo.f96763OooOo0o = null;
                c27573o00oo.f96762OooOo = null;
                c27573o00oo.f96766OooOoOO = 3;
            }
            return obj;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e9 -> B:14:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO00o(Set set, String str, boolean z, Continuation continuation) {
        C27572o00oOooo c27572o00oOooo;
        C27585o00ooO0 c27585o00ooO0;
        Collection arrayList;
        Iterator it;
        Collection collection;
        boolean z2;
        C27585o00ooO0 c27585o00ooO02;
        String str2;
        Collection collection2;
        Iterator it2;
        C27020OooOoO0 c27020OooOoO0;
        if (continuation instanceof C27572o00oOooo) {
            c27572o00oOooo = (C27572o00oOooo) continuation;
            int i = c27572o00oOooo.f96761Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27572o00oOooo.f96761Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c27572o00oOooo = new C27572o00oOooo(this, continuation);
            }
        }
        Object objOooO = c27572o00oOooo.f96759OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27572o00oOooo.f96761Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            c27572o00oOooo.f96753OooOo0o = this;
            c27572o00oOooo.f96752OooOo = str;
            c27572o00oOooo.f96757OooOoo = z;
            c27572o00oOooo.f96761Oooo000 = 1;
            objOooO = this.f96840OooO0oO.OooO(str, set, c27572o00oOooo);
            if (objOooO != enumC32485OooO00o) {
                c27585o00ooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            z = c27572o00oOooo.f96757OooOoo;
            str = c27572o00oOooo.f96752OooOo;
            c27585o00ooO0 = c27572o00oOooo.f96753OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
        } else {
            if (i2 == 2) {
                z2 = c27572o00oOooo.f96757OooOoo;
                collection = (Collection) c27572o00oOooo.f96756OooOoOO;
                Iterator it3 = c27572o00oOooo.f96754OooOoO;
                Collection collection3 = c27572o00oOooo.f96755OooOoO0;
                String str3 = c27572o00oOooo.f96752OooOo;
                C27585o00ooO0 c27585o00ooO03 = c27572o00oOooo.f96753OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO);
                c27585o00ooO02 = c27585o00ooO03;
                str2 = str3;
                collection2 = collection3;
                it2 = it3;
                c27020OooOoO0 = c27585o00ooO02.f96840OooO0oO;
                c27572o00oOooo.f96753OooOo0o = c27585o00ooO02;
                c27572o00oOooo.f96752OooOo = str2;
                c27572o00oOooo.f96755OooOoO0 = collection2;
                c27572o00oOooo.f96754OooOoO = it2;
                c27572o00oOooo.f96756OooOoOO = objOooO;
                c27572o00oOooo.f96758OooOoo0 = collection;
                c27572o00oOooo.f96757OooOoo = z2;
                c27572o00oOooo.f96761Oooo000 = 3;
                if (c27020OooOoO0.OooOO0(str2, (List) objOooO, c27572o00oOooo) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = c27572o00oOooo.f96757OooOoo;
            collection = c27572o00oOooo.f96758OooOoo0;
            Object obj = c27572o00oOooo.f96756OooOoOO;
            it2 = c27572o00oOooo.f96754OooOoO;
            collection2 = c27572o00oOooo.f96755OooOoO0;
            str2 = c27572o00oOooo.f96752OooOo;
            c27585o00ooO02 = c27572o00oOooo.f96753OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
            boolean z3 = z2;
            c27585o00ooO0 = c27585o00ooO02;
            collection.add((List) obj);
            z = z3;
            it = it2;
            arrayList = collection2;
            str = str2;
            Object next = null;
            if (it.hasNext()) {
                List list = (List) it.next();
                c27572o00oOooo.f96753OooOo0o = c27585o00ooO0;
                c27572o00oOooo.f96752OooOo = str;
                c27572o00oOooo.f96755OooOoO0 = arrayList;
                c27572o00oOooo.f96754OooOoO = it;
                c27572o00oOooo.f96756OooOoOO = arrayList;
                c27572o00oOooo.f96758OooOoo0 = null;
                c27572o00oOooo.f96757OooOoo = z;
                c27572o00oOooo.f96761Oooo000 = 2;
                Serializable serializableOooO0O0 = c27585o00ooO0.OooO0O0(list, z, c27572o00oOooo);
                if (serializableOooO0O0 != enumC32485OooO00o) {
                    c27585o00ooO02 = c27585o00ooO0;
                    str2 = str;
                    z2 = z;
                    collection = arrayList;
                    it2 = it;
                    objOooO = serializableOooO0O0;
                    collection2 = collection;
                    c27020OooOoO0 = c27585o00ooO02.f96840OooO0oO;
                    c27572o00oOooo.f96753OooOo0o = c27585o00ooO02;
                    c27572o00oOooo.f96752OooOo = str2;
                    c27572o00oOooo.f96755OooOoO0 = collection2;
                    c27572o00oOooo.f96754OooOoO = it2;
                    c27572o00oOooo.f96756OooOoOO = objOooO;
                    c27572o00oOooo.f96758OooOoo0 = collection;
                    c27572o00oOooo.f96757OooOoo = z2;
                    c27572o00oOooo.f96761Oooo000 = 3;
                    if (c27020OooOoO0.OooOO0(str2, (List) objOooO, c27572o00oOooo) != enumC32485OooO00o) {
                        obj = objOooO;
                        boolean z32 = z2;
                        c27585o00ooO0 = c27585o00ooO02;
                        collection.add((List) obj);
                        z = z32;
                        it = it2;
                        arrayList = collection2;
                        str = str2;
                        Object next2 = null;
                        if (it.hasNext()) {
                            Iterator it4 = ((List) arrayList).iterator();
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                while (it4.hasNext()) {
                                    next2 = oOo000Oo.OooOo.OooooOO((List) next2, (List) it4.next());
                                }
                            }
                            Iterable iterable = (List) next2;
                            if (iterable == null) {
                                iterable = C34434OooOoO.f123453OooOo0o;
                            }
                            Iterable iterable2 = iterable;
                            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable2, 10));
                            if (iOooO0Oo < 16) {
                                iOooO0Oo = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                            for (Object obj2 : iterable2) {
                                linkedHashMap.put(((Page) obj2).getId(), obj2);
                            }
                            return linkedHashMap;
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }
        ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O((List) objOooO, 5);
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooo00O, 10));
        it = arrayListOooo00O.iterator();
        Object next22 = null;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0115 -> B:52:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(List list, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27574o00oo0 c27574o00oo0;
        Iterator it;
        Collection collection;
        C27585o00ooO0 c27585o00ooO0;
        List list2;
        List list3;
        List list4;
        List list5;
        if (abstractC32479OooO0OO instanceof C27574o00oo0) {
            c27574o00oo0 = (C27574o00oo0) abstractC32479OooO0OO;
            int i = c27574o00oo0.f96775OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27574o00oo0.f96775OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27574o00oo0 = new C27574o00oo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27574o00oo0.f96772OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27574o00oo0.f96775OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (list.isEmpty()) {
                return C34434OooOoO.f123453OooOo0o;
            }
            List list6 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list6) {
                Page page = (Page) obj2;
                if (!z && page.getTnPath().length() > 0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list6) {
                Page page2 = (Page) obj3;
                if (z || page2.getTnPath().length() == 0) {
                    arrayList2.add(obj3);
                }
            }
            if (arrayList2.isEmpty()) {
                return arrayList;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (((Page) obj4).getUnbounded()) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
            it = arrayList3.iterator();
            collection = arrayList4;
            c27585o00ooO0 = this;
            list2 = arrayList2;
            list3 = arrayList;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list4 = c27574o00oo0.f96767OooOo;
            List list7 = (List) c27574o00oo0.f96768OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list5 = list7;
            return oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(list5, list4), (List) obj);
        }
        collection = c27574o00oo0.f96773OooOoo0;
        it = c27574o00oo0.f96771OooOoOO;
        Collection collection2 = c27574o00oo0.f96769OooOoO;
        list2 = c27574o00oo0.f96770OooOoO0;
        List list8 = c27574o00oo0.f96767OooOo;
        c27585o00ooO0 = (C27585o00ooO0) c27574o00oo0.f96768OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list9 = list8;
        collection.add((Page) obj);
        collection = collection2;
        list3 = list9;
        if (it.hasNext()) {
            Page page3 = (Page) it.next();
            c27574o00oo0.f96768OooOo0o = c27585o00ooO0;
            c27574o00oo0.f96767OooOo = list3;
            c27574o00oo0.f96770OooOoO0 = list2;
            Collection collection3 = collection;
            c27574o00oo0.f96769OooOoO = collection3;
            c27574o00oo0.f96771OooOoOO = it;
            c27574o00oo0.f96773OooOoo0 = collection3;
            c27574o00oo0.f96775OooOooo = 1;
            Object objOooO0Oo = c27585o00ooO0.OooO0Oo(page3, c27574o00oo0);
            if (objOooO0Oo != enumC32485OooO00o) {
                list9 = list3;
                obj = objOooO0Oo;
                collection2 = collection;
                collection.add((Page) obj);
                collection = collection2;
                list3 = list9;
                if (it.hasNext()) {
                    list4 = (List) collection;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (!((Page) obj5).getUnbounded()) {
                            arrayList5.add(obj5);
                        }
                    }
                    c27574o00oo0.f96768OooOo0o = list3;
                    c27574o00oo0.f96767OooOo = list4;
                    c27574o00oo0.f96770OooOoO0 = null;
                    c27574o00oo0.f96769OooOoO = null;
                    c27574o00oo0.f96771OooOoOO = null;
                    c27574o00oo0.f96773OooOoo0 = null;
                    c27574o00oo0.f96775OooOooo = 2;
                    Object objOooO0oO = c27585o00ooO0.OooO0oO(arrayList5, c27574o00oo0);
                    if (objOooO0oO != enumC32485OooO00o) {
                        List list10 = list3;
                        obj = objOooO0oO;
                        list5 = list10;
                        return oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(list5, list4), (List) obj);
                    }
                }
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r11.OooOOO0(r10, r1) == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(NoteMeta noteMeta, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27579o00oo0OO c27579o00oo0OO;
        C27585o00ooO0 c27585o00ooO0;
        String tnPath;
        if (abstractC32479OooO0OO instanceof C27579o00oo0OO) {
            c27579o00oo0OO = (C27579o00oo0OO) abstractC32479OooO0OO;
            int i = c27579o00oo0OO.f96805OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27579o00oo0OO.f96805OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27579o00oo0OO = new C27579o00oo0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27579o00oo0OO.f96804OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27579o00oo0OO.f96805OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            try {
                String id = noteMeta.getId();
                c27579o00oo0OO.f96802OooOo0o = this;
                c27579o00oo0OO.f96801OooOo = noteMeta;
                c27579o00oo0OO.f96805OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27576o00oo00O(this, id, null), c27579o00oo0OO);
                if (objOooO0o != enumC32485OooO00o) {
                    c27585o00ooO0 = this;
                }
            } catch (Exception e) {
                e = e;
                c27585o00ooO0 = this;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TnUseCase");
                c20358OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("createNoteCoverTn exception: ", noteMeta.getId()), new Object[0]);
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        noteMeta = c27579o00oo0OO.f96801OooOo;
        c27585o00ooO0 = c27579o00oo0OO.f96802OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO0o);
        } catch (Exception e2) {
            e = e2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("TnUseCase");
            c20358OooO00o2.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("createNoteCoverTn exception: ", noteMeta.getId()), new Object[0]);
        }
        Page page = (Page) objOooO0o;
        if (page != null && (tnPath = page.getTnPath()) != null) {
            noteMeta.setTnPath(tnPath);
        }
        C34406OooO00o.f123390OooO00o.OooO00o("createNoteCoverTn success: " + noteMeta.getId(), new Object[0]);
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27585o00ooO0.f96843OooOO0O;
        c27579o00oo0OO.f96802OooOo0o = null;
        c27579o00oo0OO.f96801OooOo = null;
        c27579o00oo0OO.f96805OooOoOO = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[Catch: IllegalStateException -> 0x0079, PHI: r0 r4 r7 r8
      0x012d: PHI (r0v20 android.graphics.Bitmap) = (r0v18 android.graphics.Bitmap), (r0v27 android.graphics.Bitmap) binds: [B:54:0x0129, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r4v13 com.orion.notein.domain.models.page.Page) = (r4v10 com.orion.notein.domain.models.page.Page), (r4v15 com.orion.notein.domain.models.page.Page) binds: [B:54:0x0129, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r7v10 android.graphics.RectF) = (r7v7 android.graphics.RectF), (r7v25 android.graphics.RectF) binds: [B:54:0x0129, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r8v11 ??) = (r8v19 ??), (r8v13 ??) binds: [B:54:0x0129, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {IllegalStateException -> 0x0079, blocks: (B:18:0x0041, B:31:0x008a, B:68:0x01f4, B:69:0x01f7, B:56:0x012d, B:58:0x0140, B:60:0x0151, B:62:0x01ac, B:64:0x01e1, B:63:0x01c7, B:53:0x0112, B:49:0x00fc), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140 A[Catch: IllegalStateException -> 0x0079, TryCatch #3 {IllegalStateException -> 0x0079, blocks: (B:18:0x0041, B:31:0x008a, B:68:0x01f4, B:69:0x01f7, B:56:0x012d, B:58:0x0140, B:60:0x0151, B:62:0x01ac, B:64:0x01e1, B:63:0x01c7, B:53:0x0112, B:49:0x00fc), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac A[Catch: IllegalStateException -> 0x0079, TryCatch #3 {IllegalStateException -> 0x0079, blocks: (B:18:0x0041, B:31:0x008a, B:68:0x01f4, B:69:0x01f7, B:56:0x012d, B:58:0x0140, B:60:0x0151, B:62:0x01ac, B:64:0x01e1, B:63:0x01c7, B:53:0x0112, B:49:0x00fc), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7 A[Catch: IllegalStateException -> 0x0079, TryCatch #3 {IllegalStateException -> 0x0079, blocks: (B:18:0x0041, B:31:0x008a, B:68:0x01f4, B:69:0x01f7, B:56:0x012d, B:58:0x0140, B:60:0x0151, B:62:0x01ac, B:64:0x01e1, B:63:0x01c7, B:53:0x0112, B:49:0x00fc), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o0OOo0o.o00oo0O0, oO00ooo.OooO0OO] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.orion.notein.domain.models.page.Page] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.orion.notein.domain.models.page.Page] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v26, types: [o0OO00o0.o00o0oOO] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32, types: [o0OO00o0.o00o0oOO] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, o0OOo0o.o00ooO0] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [o0OOo0o.o00ooO0] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, o0OOo0o.o00ooO0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, o0OOo0o.o00ooO0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [o0OO00o0.o00o0oOO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(Page page, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        ?? c27578o00oo0O0;
        String tnPath;
        ?? r2;
        ?? r8;
        Page page2;
        Object objOooO0o0;
        RectF rectF;
        ?? r82;
        Bitmap bitmap;
        ?? r9;
        String tnNameForNavigator;
        ?? r83;
        float fWidth;
        PaperSpec.Companion companion;
        RectF rectF2;
        RectF rectF3;
        ?? r7;
        ?? r84;
        Page page3;
        Page page4;
        if (abstractC32479OooO0OO instanceof C27578o00oo0O0) {
            C27578o00oo0O0 c27578o00oo0O02 = (C27578o00oo0O0) abstractC32479OooO0OO;
            int i = c27578o00oo0O02.f96799OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27578o00oo0O02.f96799OooOoo = i - Integer.MIN_VALUE;
                c27578o00oo0O0 = c27578o00oo0O02;
            } else {
                c27578o00oo0O0 = new C27578o00oo0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27578o00oo0O0.f96798OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r4 = c27578o00oo0O0.f96799OooOoo;
        try {
            try {
            } catch (IllegalStateException e) {
                e = e;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            c27578o00oo0O0 = r4;
        }
        switch (r4) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0oO);
                String id = page.getId();
                String noteId = page.getNoteId();
                c27578o00oo0O0.f96795OooOo0o = this;
                c27578o00oo0O0.f96794OooOo = page;
                c27578o00oo0O0.f96799OooOoo = 1;
                C27015OooOOoo c27015OooOOoo = this.f96840OooO0oO.f94064OooO00o;
                c27015OooOOoo.getClass();
                objOooO0oO = c27015OooOOoo.f94033OooO00o.OooO0oO(noteId, new o0OOO0OO.OooOOO(new C27009OooO0oO(id, null), null));
                if (objOooO0oO != enumC32485OooO00o) {
                    r8 = this;
                    page2 = page;
                    RectF rectFOooO00o = C31192OooOOOo.OooO00o((RectF) objOooO0oO, null);
                    c27578o00oo0O0.f96795OooOo0o = r8;
                    c27578o00oo0O0.f96794OooOo = page2;
                    c27578o00oo0O0.f96797OooOoO0 = rectFOooO00o;
                    c27578o00oo0O0.f96799OooOoo = 2;
                    objOooO0o0 = r8.OooO0o0(page2, rectFOooO00o, c27578o00oo0O0);
                    if (objOooO0o0 == enumC32485OooO00o) {
                        rectF = rectFOooO00o;
                        objOooO0oO = objOooO0o0;
                        r82 = r8;
                        bitmap = (Bitmap) objOooO0oO;
                        r9 = r82.f96846OooOOO0;
                        tnNameForNavigator = page2.getTnNameForNavigator();
                        c27578o00oo0O0.f96795OooOo0o = r82;
                        c27578o00oo0O0.f96794OooOo = page2;
                        c27578o00oo0O0.f96797OooOoO0 = rectF;
                        c27578o00oo0O0.f96796OooOoO = bitmap;
                        c27578o00oo0O0.f96799OooOoo = 3;
                        r83 = r82;
                        if (r9.OooO0O0(bitmap, tnNameForNavigator, c27578o00oo0O0) == enumC32485OooO00o) {
                            fWidth = rectF.width();
                            companion = PaperSpec.INSTANCE;
                            if (fWidth <= companion.getUNBOUNDED().getWidth()) {
                                r84 = r83;
                                if (rectF.height() <= companion.getUNBOUNDED().getHeight()) {
                                    ?? r72 = r84.f96846OooOOO0;
                                    String str = page2.getNoteId() + C18115b5.CONNECTOR + page2.getId();
                                    c27578o00oo0O0.f96795OooOo0o = page2;
                                    c27578o00oo0O0.f96794OooOo = null;
                                    c27578o00oo0O0.f96797OooOoO0 = null;
                                    c27578o00oo0O0.f96796OooOoO = null;
                                    c27578o00oo0O0.f96799OooOoo = 5;
                                    objOooO0oO = r72.OooO0O0(bitmap, str, c27578o00oo0O0);
                                    if (objOooO0oO != enumC32485OooO00o) {
                                        page3 = page2;
                                        tnPath = (String) objOooO0oO;
                                        r2 = page3;
                                        return Page.copy$default(r2, null, null, null, null, null, null, null, tnPath, false, 0, 0L, System.currentTimeMillis(), null, null, 0, false, null, null, null, 522111, null);
                                    }
                                }
                            }
                            rectF2 = new RectF(Math.max(rectF.left, companion.getUNBOUNDED().getWidth() * (-1.0f)), Math.max(rectF.top, companion.getUNBOUNDED().getHeight() * (-1.0f)), Math.min(rectF.right, companion.getUNBOUNDED().getWidth() * 2.0f), Math.min(rectF.bottom, companion.getUNBOUNDED().getHeight() * 2.0f));
                            if (rectF2.height() * 0.74615383f <= rectF2.width()) {
                                float fHeight = (rectF2.height() / 2.0f) + rectF2.top;
                                float fWidth2 = (rectF2.width() / 0.74615383f) * 0.5f;
                                rectF3 = new RectF(rectF2.left, fHeight - fWidth2, rectF2.right, fHeight + fWidth2);
                            } else {
                                float fWidth3 = (rectF2.width() / 2.0f) + rectF2.left;
                                float fHeight2 = rectF2.height() * 0.74615383f * 0.5f;
                                rectF3 = new RectF(fWidth3 - fHeight2, rectF2.top, fWidth3 + fHeight2, rectF2.bottom);
                            }
                            c27578o00oo0O0.f96795OooOo0o = r83;
                            c27578o00oo0O0.f96794OooOo = page2;
                            c27578o00oo0O0.f96797OooOoO0 = null;
                            c27578o00oo0O0.f96796OooOoO = null;
                            c27578o00oo0O0.f96799OooOoo = 4;
                            objOooO0oO = r83.OooO0o0(page2, rectF3, c27578o00oo0O0);
                            if (objOooO0oO == enumC32485OooO00o) {
                                r7 = r83;
                                bitmap = (Bitmap) objOooO0oO;
                                r84 = r7;
                                ?? r722 = r84.f96846OooOOO0;
                                String str2 = page2.getNoteId() + C18115b5.CONNECTOR + page2.getId();
                                c27578o00oo0O0.f96795OooOo0o = page2;
                                c27578o00oo0O0.f96794OooOo = null;
                                c27578o00oo0O0.f96797OooOoO0 = null;
                                c27578o00oo0O0.f96796OooOoO = null;
                                c27578o00oo0O0.f96799OooOoo = 5;
                                objOooO0oO = r722.OooO0O0(bitmap, str2, c27578o00oo0O0);
                                if (objOooO0oO != enumC32485OooO00o) {
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                page2 = c27578o00oo0O0.f96794OooOo;
                C27585o00ooO0 c27585o00ooO0 = (C27585o00ooO0) c27578o00oo0O0.f96795OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                r8 = c27585o00ooO0;
                RectF rectFOooO00o2 = C31192OooOOOo.OooO00o((RectF) objOooO0oO, null);
                c27578o00oo0O0.f96795OooOo0o = r8;
                c27578o00oo0O0.f96794OooOo = page2;
                c27578o00oo0O0.f96797OooOoO0 = rectFOooO00o2;
                c27578o00oo0O0.f96799OooOoo = 2;
                objOooO0o0 = r8.OooO0o0(page2, rectFOooO00o2, c27578o00oo0O0);
                if (objOooO0o0 == enumC32485OooO00o) {
                }
                break;
            case 2:
                RectF rectF4 = c27578o00oo0O0.f96797OooOoO0;
                Page page5 = c27578o00oo0O0.f96794OooOo;
                C27585o00ooO0 c27585o00ooO02 = (C27585o00ooO0) c27578o00oo0O0.f96795OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    rectF = rectF4;
                    page2 = page5;
                    r82 = c27585o00ooO02;
                    bitmap = (Bitmap) objOooO0oO;
                    r9 = r82.f96846OooOOO0;
                    tnNameForNavigator = page2.getTnNameForNavigator();
                    c27578o00oo0O0.f96795OooOo0o = r82;
                    c27578o00oo0O0.f96794OooOo = page2;
                    c27578o00oo0O0.f96797OooOoO0 = rectF;
                    c27578o00oo0O0.f96796OooOoO = bitmap;
                    c27578o00oo0O0.f96799OooOoo = 3;
                    r83 = r82;
                    if (r9.OooO0O0(bitmap, tnNameForNavigator, c27578o00oo0O0) == enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                } catch (IllegalStateException e3) {
                    e = e3;
                    c27578o00oo0O0 = page5;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TnUseCase");
                    c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("createUnboundedPageTn: ", e.getMessage()), new Object[0]);
                    tnPath = c27578o00oo0O0.getTnPath();
                    r2 = c27578o00oo0O0;
                }
                break;
            case 3:
                Bitmap bitmap2 = c27578o00oo0O0.f96796OooOoO;
                rectF = c27578o00oo0O0.f96797OooOoO0;
                Page page6 = c27578o00oo0O0.f96794OooOo;
                C27585o00ooO0 c27585o00ooO03 = (C27585o00ooO0) c27578o00oo0O0.f96795OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    bitmap = bitmap2;
                    page2 = page6;
                    r83 = c27585o00ooO03;
                    fWidth = rectF.width();
                    companion = PaperSpec.INSTANCE;
                    if (fWidth <= companion.getUNBOUNDED().getWidth()) {
                    }
                    rectF2 = new RectF(Math.max(rectF.left, companion.getUNBOUNDED().getWidth() * (-1.0f)), Math.max(rectF.top, companion.getUNBOUNDED().getHeight() * (-1.0f)), Math.min(rectF.right, companion.getUNBOUNDED().getWidth() * 2.0f), Math.min(rectF.bottom, companion.getUNBOUNDED().getHeight() * 2.0f));
                    if (rectF2.height() * 0.74615383f <= rectF2.width()) {
                    }
                    c27578o00oo0O0.f96795OooOo0o = r83;
                    c27578o00oo0O0.f96794OooOo = page2;
                    c27578o00oo0O0.f96797OooOoO0 = null;
                    c27578o00oo0O0.f96796OooOoO = null;
                    c27578o00oo0O0.f96799OooOoo = 4;
                    objOooO0oO = r83.OooO0o0(page2, rectF3, c27578o00oo0O0);
                    if (objOooO0oO == enumC32485OooO00o) {
                    }
                } catch (IllegalStateException e4) {
                    e = e4;
                    c27578o00oo0O0 = page6;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("TnUseCase");
                    c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("createUnboundedPageTn: ", e.getMessage()), new Object[0]);
                    tnPath = c27578o00oo0O0.getTnPath();
                    r2 = c27578o00oo0O0;
                    break;
                }
                break;
            case 4:
                page2 = c27578o00oo0O0.f96794OooOo;
                C27585o00ooO0 c27585o00ooO04 = (C27585o00ooO0) c27578o00oo0O0.f96795OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                r7 = c27585o00ooO04;
                bitmap = (Bitmap) objOooO0oO;
                r84 = r7;
                ?? r7222 = r84.f96846OooOOO0;
                String str22 = page2.getNoteId() + C18115b5.CONNECTOR + page2.getId();
                c27578o00oo0O0.f96795OooOo0o = page2;
                c27578o00oo0O0.f96794OooOo = null;
                c27578o00oo0O0.f96797OooOoO0 = null;
                c27578o00oo0O0.f96796OooOoO = null;
                c27578o00oo0O0.f96799OooOoo = 5;
                objOooO0oO = r7222.OooO0O0(bitmap, str22, c27578o00oo0O0);
                if (objOooO0oO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                Page page7 = (Page) c27578o00oo0O0.f96795OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                page3 = page7;
                tnPath = (String) objOooO0oO;
                r2 = page3;
                return Page.copy$default(r2, null, null, null, null, null, null, null, tnPath, false, 0, 0L, System.currentTimeMillis(), null, null, 0, false, null, null, null, 522111, null);
            case 6:
                Page page8 = c27578o00oo0O0.f96794OooOo;
                C27585o00ooO0 c27585o00ooO05 = (C27585o00ooO0) c27578o00oo0O0.f96795OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                ?? r73 = c27585o00ooO05.f96846OooOOO0;
                String str3 = page8.getNoteId() + C18115b5.CONNECTOR + page8.getId();
                c27578o00oo0O0.f96795OooOo0o = page8;
                c27578o00oo0O0.f96794OooOo = null;
                c27578o00oo0O0.f96799OooOoo = 7;
                objOooO0oO = r73.OooO0O0((Bitmap) objOooO0oO, str3, c27578o00oo0O0);
                if (objOooO0oO != enumC32485OooO00o) {
                    page4 = page8;
                    tnPath = (String) objOooO0oO;
                    r2 = page4;
                    return Page.copy$default(r2, null, null, null, null, null, null, null, tnPath, false, 0, 0L, System.currentTimeMillis(), null, null, 0, false, null, null, null, 522111, null);
                }
                return enumC32485OooO00o;
            case 7:
                Page page9 = (Page) c27578o00oo0O0.f96795OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                page4 = page9;
                tnPath = (String) objOooO0oO;
                r2 = page4;
                return Page.copy$default(r2, null, null, null, null, null, null, null, tnPath, false, 0, 0L, System.currentTimeMillis(), null, null, 0, false, null, null, null, 522111, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x031e, code lost:
    
        if (r14 != r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03af, code lost:
    
        if (r14 != r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0144 A[PHI: r2 r5 r6 r7 r11 r12 r13 r14
      0x0144: PHI (r2v13 android.graphics.RectF) = (r2v10 android.graphics.RectF), (r2v16 android.graphics.RectF) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r5v9 java.lang.String) = (r5v6 java.lang.String), (r5v13 java.lang.String) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r6v13 java.lang.String) = (r6v10 java.lang.String), (r6v16 java.lang.String) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r7v11 o0OOo0o.o00ooO0) = (r7v8 o0OOo0o.o00ooO0), (r7v13 o0OOo0o.o00ooO0) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r11v14 java.util.List) = (r11v11 java.util.List), (r11v16 java.util.List) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r12v12 java.util.List) = (r12v9 java.util.List), (r12v14 java.util.List) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r13v14 java.util.List) = (r13v11 java.util.List), (r13v16 java.util.List) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r14v21 java.lang.Object) = (r14v20 java.lang.Object), (r14v1 java.lang.Object) binds: [B:46:0x0257, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230 A[PHI: r2 r5 r6 r7 r11 r12 r13 r14
      0x0230: PHI (r2v10 android.graphics.RectF) = (r2v7 android.graphics.RectF), (r2v12 android.graphics.RectF) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r5v6 java.lang.String) = (r5v3 java.lang.String), (r5v8 java.lang.String) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v10 java.lang.String) = (r6v7 java.lang.String), (r6v12 java.lang.String) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r7v8 o0OOo0o.o00ooO0) = (r7v5 o0OOo0o.o00ooO0), (r7v10 o0OOo0o.o00ooO0) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r11v11 java.util.List) = (r11v8 java.util.List), (r11v13 java.util.List) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r12v9 java.util.List) = (r12v6 java.util.List), (r12v11 java.util.List) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r13v11 java.util.List) = (r13v8 java.util.List), (r13v13 java.util.List) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r14v16 java.lang.Object) = (r14v15 java.lang.Object), (r14v1 java.lang.Object) binds: [B:43:0x022c, B:23:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d4 A[PHI: r2 r5 r6 r11 r12 r13 r14
      0x02d4: PHI (r2v23 java.lang.String) = (r2v20 java.lang.String), (r2v25 java.lang.String) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r5v20 java.lang.String) = (r5v17 java.lang.String), (r5v22 java.lang.String) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r6v23 o0OOo0o.o00ooO0) = (r6v20 o0OOo0o.o00ooO0), (r6v25 o0OOo0o.o00ooO0) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r11v23 java.util.List) = (r11v20 java.util.List), (r11v25 java.util.List) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r12v21 java.util.List) = (r12v18 java.util.List), (r12v23 java.util.List) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r13v23 java.util.List) = (r13v20 java.util.List), (r13v25 java.util.List) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x02d4: PHI (r14v34 java.lang.Object) = (r14v33 java.lang.Object), (r14v1 java.lang.Object) binds: [B:58:0x02d0, B:18:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fb A[PHI: r2 r5 r6 r11 r12 r13 r14
      0x02fb: PHI (r2v26 java.lang.String) = (r2v23 java.lang.String), (r2v28 java.lang.String) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r5v23 java.lang.String) = (r5v20 java.lang.String), (r5v25 java.lang.String) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r6v26 o0OOo0o.o00ooO0) = (r6v23 o0OOo0o.o00ooO0), (r6v28 o0OOo0o.o00ooO0) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r11v26 java.util.List) = (r11v23 java.util.List), (r11v28 java.util.List) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r12v24 java.util.List) = (r12v21 java.util.List), (r12v26 java.util.List) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r13v26 java.util.List) = (r13v23 java.util.List), (r13v28 java.util.List) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r14v39 java.lang.Object) = (r14v38 java.lang.Object), (r14v1 java.lang.Object) binds: [B:61:0x02f7, B:17:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0346 A[PHI: r2 r5 r6 r11 r12 r13 r14
      0x0346: PHI (r2v33 java.lang.String) = (r2v29 java.lang.String), (r2v35 java.lang.String) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r5v30 java.lang.String) = (r5v26 java.lang.String), (r5v32 java.lang.String) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r6v33 o0OOo0o.o00ooO0) = (r6v29 o0OOo0o.o00ooO0), (r6v35 o0OOo0o.o00ooO0) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r11v33 java.util.List) = (r11v29 java.util.List), (r11v35 java.util.List) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r12v31 java.util.List) = (r12v27 java.util.List), (r12v33 java.util.List) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r13v33 java.util.List) = (r13v29 java.util.List), (r13v35 java.util.List) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0346: PHI (r14v49 java.lang.Object) = (r14v45 java.lang.Object), (r14v1 java.lang.Object) binds: [B:68:0x0343, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x036c A[PHI: r2 r5 r6 r11 r12 r13 r14
      0x036c: PHI (r2v36 java.lang.String) = (r2v33 java.lang.String), (r2v38 java.lang.String) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r5v33 java.lang.String) = (r5v30 java.lang.String), (r5v35 java.lang.String) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r6v36 o0OOo0o.o00ooO0) = (r6v33 o0OOo0o.o00ooO0), (r6v38 o0OOo0o.o00ooO0) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r11v36 java.util.List) = (r11v33 java.util.List), (r11v38 java.util.List) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r12v34 java.util.List) = (r12v31 java.util.List), (r12v36 java.util.List) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r13v36 java.util.List) = (r13v33 java.util.List), (r13v38 java.util.List) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r14v54 java.lang.Object) = (r14v53 java.lang.Object), (r14v1 java.lang.Object) binds: [B:71:0x0369, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0392 A[PHI: r2 r5 r6 r11 r12 r13 r14
      0x0392: PHI (r2v39 java.lang.String) = (r2v36 java.lang.String), (r2v41 java.lang.String) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r5v36 java.lang.String) = (r5v33 java.lang.String), (r5v38 java.lang.String) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r6v39 o0OOo0o.o00ooO0) = (r6v36 o0OOo0o.o00ooO0), (r6v41 o0OOo0o.o00ooO0) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r11v39 java.util.List) = (r11v36 java.util.List), (r11v41 java.util.List) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r12v37 java.util.List) = (r12v34 java.util.List), (r12v39 java.util.List) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r13v39 java.util.List) = (r13v36 java.util.List), (r13v41 java.util.List) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r14v59 java.lang.Object) = (r14v58 java.lang.Object), (r14v1 java.lang.Object) binds: [B:74:0x038f, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o(String str, String str2, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27580o00oo0Oo c27580o00oo0Oo;
        C27585o00ooO0 c27585o00ooO0;
        C27585o00ooO0 c27585o00ooO02;
        String str3;
        List list;
        List list2;
        String str4;
        List list3;
        C27585o00ooO0 c27585o00ooO03;
        RectF rectF2;
        String str5;
        String str6;
        if (abstractC32479OooO0OO instanceof C27580o00oo0Oo) {
            c27580o00oo0Oo = (C27580o00oo0Oo) abstractC32479OooO0OO;
            int i = c27580o00oo0Oo.f96815Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27580o00oo0Oo.f96815Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c27580o00oo0Oo = new C27580o00oo0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0 = c27580o00oo0Oo.f96813OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27580o00oo0Oo.f96815Oooo000) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooOO0);
                c27580o00oo0Oo.f96807OooOo0o = this;
                c27580o00oo0Oo.f96806OooOo = str;
                c27580o00oo0Oo.f96809OooOoO0 = str2;
                c27580o00oo0Oo.f96808OooOoO = rectF;
                c27580o00oo0Oo.f96815Oooo000 = 1;
                objOooOO0 = this.f96845OooOOO.OooOO0(str2, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                    c27585o00ooO0 = this;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (Iterable) objOooOO0) {
                        if (((PageLayer) obj).getVisible()) {
                            arrayList.add(obj);
                        }
                    }
                    C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                    if (rectF == null) {
                        C26596o00O0o0 c26596o00O0o0 = c27585o00ooO0.f96835OooO0O0;
                        c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO0;
                        c27580o00oo0Oo.f96806OooOo = str;
                        c27580o00oo0Oo.f96809OooOoO0 = str2;
                        c27580o00oo0Oo.f96808OooOoO = rectF;
                        c27580o00oo0Oo.f96810OooOoOO = arrayList;
                        c27580o00oo0Oo.f96812OooOoo0 = c32465OooO0O0OooO0Oo;
                        c27580o00oo0Oo.f96811OooOoo = c32465OooO0O0OooO0Oo;
                        c27580o00oo0Oo.f96815Oooo000 = 2;
                        Serializable serializableOooOOOO = c26596o00O0o0.OooOOOO(str, str2, rectF, c27580o00oo0Oo);
                        if (serializableOooOOOO != enumC32485OooO00o) {
                            c27585o00ooO03 = c27585o00ooO0;
                            rectF2 = rectF;
                            list2 = arrayList;
                            str5 = str2;
                            list = c32465OooO0O0OooO0Oo;
                            objOooOO0 = serializableOooOOOO;
                            str6 = str;
                            list3 = list;
                            list3.addAll((List) objOooOO0);
                            C26264OooOOO0 c26264OooOOO0 = c27585o00ooO03.f96836OooO0OO;
                            c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO03;
                            c27580o00oo0Oo.f96806OooOo = str6;
                            c27580o00oo0Oo.f96809OooOoO0 = str5;
                            c27580o00oo0Oo.f96808OooOoO = rectF2;
                            c27580o00oo0Oo.f96810OooOoOO = list2;
                            c27580o00oo0Oo.f96812OooOoo0 = list;
                            c27580o00oo0Oo.f96811OooOoo = list3;
                            c27580o00oo0Oo.f96815Oooo000 = 3;
                            objOooOO0 = c26264OooOOO0.OooO0o0(str6, str5, rectF2, c27580o00oo0Oo);
                            if (objOooOO0 != enumC32485OooO00o) {
                                list3.addAll((List) objOooOO0);
                                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = c27585o00ooO03.f96834OooO00o;
                                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO03;
                                c27580o00oo0Oo.f96806OooOo = str6;
                                c27580o00oo0Oo.f96809OooOoO0 = str5;
                                c27580o00oo0Oo.f96808OooOoO = rectF2;
                                c27580o00oo0Oo.f96810OooOoOO = list2;
                                c27580o00oo0Oo.f96812OooOoo0 = list;
                                c27580o00oo0Oo.f96811OooOoo = list3;
                                c27580o00oo0Oo.f96815Oooo000 = 4;
                                objOooOO0 = interfaceC27323Oooo0oO.OooOO0(str6, str5, rectF2, c27580o00oo0Oo);
                                if (objOooOO0 != enumC32485OooO00o) {
                                    String str7 = str5;
                                    RectF rectF3 = rectF2;
                                    str3 = str7;
                                    list3.addAll((List) objOooOO0);
                                    C26649o00OoooO c26649o00OoooO = c27585o00ooO03.f96838OooO0o;
                                    c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO03;
                                    c27580o00oo0Oo.f96806OooOo = str6;
                                    c27580o00oo0Oo.f96809OooOoO0 = str3;
                                    c27580o00oo0Oo.f96808OooOoO = list2;
                                    c27580o00oo0Oo.f96810OooOoOO = list;
                                    c27580o00oo0Oo.f96812OooOoo0 = list3;
                                    c27580o00oo0Oo.f96811OooOoo = null;
                                    c27580o00oo0Oo.f96815Oooo000 = 5;
                                    objOooOO0 = c26649o00OoooO.OooO0Oo(str6, str3, rectF3, c27580o00oo0Oo);
                                    if (objOooOO0 != enumC32485OooO00o) {
                                        str4 = str6;
                                        c27585o00ooO02 = c27585o00ooO03;
                                        list3.addAll((List) objOooOO0);
                                        C24378OooOoO0 c24378OooOoO0 = c27585o00ooO02.f96839OooO0o0;
                                        c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                                        c27580o00oo0Oo.f96806OooOo = str4;
                                        c27580o00oo0Oo.f96809OooOoO0 = str3;
                                        c27580o00oo0Oo.f96808OooOoO = list2;
                                        c27580o00oo0Oo.f96810OooOoOO = list;
                                        c27580o00oo0Oo.f96812OooOoo0 = list3;
                                        c27580o00oo0Oo.f96815Oooo000 = 10;
                                        objOooOO0 = c24378OooOoO0.OooO0Oo(str4, str3, c27580o00oo0Oo);
                                        if (objOooOO0 != enumC32485OooO00o) {
                                            list3.addAll((List) objOooOO0);
                                            C26515OooooO0 c26515OooooO0 = c27585o00ooO02.f96837OooO0Oo;
                                            c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                                            c27580o00oo0Oo.f96806OooOo = str4;
                                            c27580o00oo0Oo.f96809OooOoO0 = str3;
                                            c27580o00oo0Oo.f96808OooOoO = list2;
                                            c27580o00oo0Oo.f96810OooOoOO = list;
                                            c27580o00oo0Oo.f96812OooOoo0 = list3;
                                            c27580o00oo0Oo.f96815Oooo000 = 11;
                                            objOooOO0 = c26515OooooO0.OooOOO(str4, str3, c27580o00oo0Oo);
                                            if (objOooOO0 != enumC32485OooO00o) {
                                                list3.addAll((List) objOooOO0);
                                                C26515OooooO0 c26515OooooO02 = c27585o00ooO02.f96837OooO0Oo;
                                                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                                                c27580o00oo0Oo.f96806OooOo = str4;
                                                c27580o00oo0Oo.f96809OooOoO0 = str3;
                                                c27580o00oo0Oo.f96808OooOoO = list2;
                                                c27580o00oo0Oo.f96810OooOoOO = list;
                                                c27580o00oo0Oo.f96812OooOoo0 = list3;
                                                c27580o00oo0Oo.f96815Oooo000 = 12;
                                                objOooOO0 = c26515OooooO02.OooOO0O(str4, str3, c27580o00oo0Oo);
                                                if (objOooOO0 != enumC32485OooO00o) {
                                                    list3.addAll((List) objOooOO0);
                                                    InterfaceC27301OooOOo interfaceC27301OooOOo = c27585o00ooO02.f96847OooOOOO;
                                                    c27580o00oo0Oo.f96807OooOo0o = list2;
                                                    c27580o00oo0Oo.f96806OooOo = list;
                                                    c27580o00oo0Oo.f96809OooOoO0 = list3;
                                                    c27580o00oo0Oo.f96808OooOoO = null;
                                                    c27580o00oo0Oo.f96810OooOoOO = null;
                                                    c27580o00oo0Oo.f96812OooOoo0 = null;
                                                    c27580o00oo0Oo.f96815Oooo000 = 13;
                                                    objOooOO0 = interfaceC27301OooOOo.OooO0o0(str4, str3, c27580o00oo0Oo);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        C26596o00O0o0 c26596o00O0o02 = c27585o00ooO0.f96835OooO0O0;
                        c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO0;
                        c27580o00oo0Oo.f96806OooOo = str;
                        c27580o00oo0Oo.f96809OooOoO0 = str2;
                        c27580o00oo0Oo.f96808OooOoO = arrayList;
                        c27580o00oo0Oo.f96810OooOoOO = c32465OooO0O0OooO0Oo;
                        c27580o00oo0Oo.f96812OooOoo0 = c32465OooO0O0OooO0Oo;
                        c27580o00oo0Oo.f96815Oooo000 = 6;
                        Serializable serializableOooOOO0 = c26596o00O0o02.OooOOO0(str, str2, c27580o00oo0Oo);
                        if (serializableOooOOO0 != enumC32485OooO00o) {
                            c27585o00ooO02 = c27585o00ooO0;
                            str3 = str2;
                            list = c32465OooO0O0OooO0Oo;
                            objOooOO0 = serializableOooOOO0;
                            list2 = arrayList;
                            str4 = str;
                            list3 = list;
                            list3.addAll((List) objOooOO0);
                            C26264OooOOO0 c26264OooOOO02 = c27585o00ooO02.f96836OooO0OO;
                            c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                            c27580o00oo0Oo.f96806OooOo = str4;
                            c27580o00oo0Oo.f96809OooOoO0 = str3;
                            c27580o00oo0Oo.f96808OooOoO = list2;
                            c27580o00oo0Oo.f96810OooOoOO = list;
                            c27580o00oo0Oo.f96812OooOoo0 = list3;
                            c27580o00oo0Oo.f96815Oooo000 = 7;
                            objOooOO0 = c26264OooOOO02.OooO0Oo(str4, str3, c27580o00oo0Oo);
                            if (objOooOO0 != enumC32485OooO00o) {
                                list3.addAll((List) objOooOO0);
                                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO2 = c27585o00ooO02.f96834OooO00o;
                                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                                c27580o00oo0Oo.f96806OooOo = str4;
                                c27580o00oo0Oo.f96809OooOoO0 = str3;
                                c27580o00oo0Oo.f96808OooOoO = list2;
                                c27580o00oo0Oo.f96810OooOoOO = list;
                                c27580o00oo0Oo.f96812OooOoo0 = list3;
                                c27580o00oo0Oo.f96815Oooo000 = 8;
                                objOooOO0 = interfaceC27323Oooo0oO2.OooO0oo(str4, str3, c27580o00oo0Oo);
                                if (objOooOO0 != enumC32485OooO00o) {
                                    list3.addAll((List) objOooOO0);
                                    C26649o00OoooO c26649o00OoooO2 = c27585o00ooO02.f96838OooO0o;
                                    c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                                    c27580o00oo0Oo.f96806OooOo = str4;
                                    c27580o00oo0Oo.f96809OooOoO0 = str3;
                                    c27580o00oo0Oo.f96808OooOoO = list2;
                                    c27580o00oo0Oo.f96810OooOoOO = list;
                                    c27580o00oo0Oo.f96812OooOoo0 = list3;
                                    c27580o00oo0Oo.f96815Oooo000 = 9;
                                    objOooOO0 = c26649o00OoooO2.OooO0OO(str4, str3, c27580o00oo0Oo);
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                rectF = (RectF) c27580o00oo0Oo.f96808OooOoO;
                str2 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO0 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                ArrayList arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                }
                C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                if (rectF == null) {
                }
                return enumC32485OooO00o;
            case 2:
                list3 = c27580o00oo0Oo.f96811OooOoo;
                list = c27580o00oo0Oo.f96812OooOoo0;
                list2 = c27580o00oo0Oo.f96810OooOoOO;
                rectF2 = (RectF) c27580o00oo0Oo.f96808OooOoO;
                str5 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str6 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO03 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C26264OooOOO0 c26264OooOOO03 = c27585o00ooO03.f96836OooO0OO;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO03;
                c27580o00oo0Oo.f96806OooOo = str6;
                c27580o00oo0Oo.f96809OooOoO0 = str5;
                c27580o00oo0Oo.f96808OooOoO = rectF2;
                c27580o00oo0Oo.f96810OooOoOO = list2;
                c27580o00oo0Oo.f96812OooOoo0 = list;
                c27580o00oo0Oo.f96811OooOoo = list3;
                c27580o00oo0Oo.f96815Oooo000 = 3;
                objOooOO0 = c26264OooOOO03.OooO0o0(str6, str5, rectF2, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                list3 = c27580o00oo0Oo.f96811OooOoo;
                list = c27580o00oo0Oo.f96812OooOoo0;
                list2 = c27580o00oo0Oo.f96810OooOoOO;
                rectF2 = (RectF) c27580o00oo0Oo.f96808OooOoO;
                str5 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str6 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO03 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO3 = c27585o00ooO03.f96834OooO00o;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO03;
                c27580o00oo0Oo.f96806OooOo = str6;
                c27580o00oo0Oo.f96809OooOoO0 = str5;
                c27580o00oo0Oo.f96808OooOoO = rectF2;
                c27580o00oo0Oo.f96810OooOoOO = list2;
                c27580o00oo0Oo.f96812OooOoo0 = list;
                c27580o00oo0Oo.f96811OooOoo = list3;
                c27580o00oo0Oo.f96815Oooo000 = 4;
                objOooOO0 = interfaceC27323Oooo0oO3.OooOO0(str6, str5, rectF2, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                list3 = c27580o00oo0Oo.f96811OooOoo;
                list = c27580o00oo0Oo.f96812OooOoo0;
                list2 = c27580o00oo0Oo.f96810OooOoOO;
                rectF2 = (RectF) c27580o00oo0Oo.f96808OooOoO;
                str5 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str6 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO03 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                String str72 = str5;
                RectF rectF32 = rectF2;
                str3 = str72;
                list3.addAll((List) objOooOO0);
                C26649o00OoooO c26649o00OoooO3 = c27585o00ooO03.f96838OooO0o;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO03;
                c27580o00oo0Oo.f96806OooOo = str6;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96811OooOoo = null;
                c27580o00oo0Oo.f96815Oooo000 = 5;
                objOooOO0 = c26649o00OoooO3.OooO0Oo(str6, str3, rectF32, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C24378OooOoO0 c24378OooOoO02 = c27585o00ooO02.f96839OooO0o0;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 10;
                objOooOO0 = c24378OooOoO02.OooO0Oo(str4, str3, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C26264OooOOO0 c26264OooOOO022 = c27585o00ooO02.f96836OooO0OO;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 7;
                objOooOO0 = c26264OooOOO022.OooO0Oo(str4, str3, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO22 = c27585o00ooO02.f96834OooO00o;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 8;
                objOooOO0 = interfaceC27323Oooo0oO22.OooO0oo(str4, str3, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C26649o00OoooO c26649o00OoooO22 = c27585o00ooO02.f96838OooO0o;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 9;
                objOooOO0 = c26649o00OoooO22.OooO0OO(str4, str3, c27580o00oo0Oo);
                break;
            case 9:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C24378OooOoO0 c24378OooOoO022 = c27585o00ooO02.f96839OooO0o0;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 10;
                objOooOO0 = c24378OooOoO022.OooO0Oo(str4, str3, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 10:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C26515OooooO0 c26515OooooO03 = c27585o00ooO02.f96837OooO0Oo;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 11;
                objOooOO0 = c26515OooooO03.OooOOO(str4, str3, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 11:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C26515OooooO0 c26515OooooO022 = c27585o00ooO02.f96837OooO0Oo;
                c27580o00oo0Oo.f96807OooOo0o = c27585o00ooO02;
                c27580o00oo0Oo.f96806OooOo = str4;
                c27580o00oo0Oo.f96809OooOoO0 = str3;
                c27580o00oo0Oo.f96808OooOoO = list2;
                c27580o00oo0Oo.f96810OooOoOO = list;
                c27580o00oo0Oo.f96812OooOoo0 = list3;
                c27580o00oo0Oo.f96815Oooo000 = 12;
                objOooOO0 = c26515OooooO022.OooOO0O(str4, str3, c27580o00oo0Oo);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 12:
                list3 = c27580o00oo0Oo.f96812OooOoo0;
                list = c27580o00oo0Oo.f96810OooOoOO;
                list2 = (List) c27580o00oo0Oo.f96808OooOoO;
                str3 = (String) c27580o00oo0Oo.f96809OooOoO0;
                str4 = (String) c27580o00oo0Oo.f96806OooOo;
                c27585o00ooO02 = (C27585o00ooO0) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                InterfaceC27301OooOOo interfaceC27301OooOOo2 = c27585o00ooO02.f96847OooOOOO;
                c27580o00oo0Oo.f96807OooOo0o = list2;
                c27580o00oo0Oo.f96806OooOo = list;
                c27580o00oo0Oo.f96809OooOoO0 = list3;
                c27580o00oo0Oo.f96808OooOoO = null;
                c27580o00oo0Oo.f96810OooOoOO = null;
                c27580o00oo0Oo.f96812OooOoo0 = null;
                c27580o00oo0Oo.f96815Oooo000 = 13;
                objOooOO0 = interfaceC27301OooOOo2.OooO0o0(str4, str3, c27580o00oo0Oo);
                break;
            case 13:
                list3 = (List) c27580o00oo0Oo.f96809OooOoO0;
                list = (List) c27580o00oo0Oo.f96806OooOo;
                list2 = (List) c27580o00oo0Oo.f96807OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0);
                list3.addAll((List) objOooOO0);
                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(list);
                List<PageLayer> list4 = list2;
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                for (PageLayer pageLayer : list4) {
                    ArrayList arrayList4 = new ArrayList();
                    ListIterator listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                    while (true) {
                        C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                        if (c20232OooO0O0.hasNext()) {
                            Object next = c20232OooO0O0.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((INoteinDisplayItem) next).getLayerId(), pageLayer.getId())) {
                                arrayList4.add(next);
                            }
                        }
                    }
                    arrayList3.add(new LayeredDisplayItems(pageLayer, arrayList4));
                }
                return arrayList3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(Page page, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27577o00oo0O c27577o00oo0O;
        float fMin;
        Object objOooO0o;
        C27585o00ooO0 c27585o00ooO0;
        Page page2;
        RectF rectF2 = rectF;
        if (abstractC32479OooO0OO instanceof C27577o00oo0O) {
            c27577o00oo0O = (C27577o00oo0O) abstractC32479OooO0OO;
            int i = c27577o00oo0O.f96792OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27577o00oo0O.f96792OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27577o00oo0O = new C27577o00oo0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27577o00oo0O.f96791OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27577o00oo0O.f96792OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO<Integer, Integer> originTnSize = page.getOriginTnSize();
            fMin = Math.min(originTnSize.f116638OooOo0o.intValue() / rectF2.width(), originTnSize.f116637OooOo.intValue() / rectF2.height());
            String id = page.getId();
            String noteId = page.getNoteId();
            c27577o00oo0O.f96788OooOo0o = this;
            c27577o00oo0O.f96787OooOo = page;
            c27577o00oo0O.f96790OooOoO0 = rectF2;
            c27577o00oo0O.f96789OooOoO = fMin;
            c27577o00oo0O.f96792OooOoo = 1;
            objOooO0o = OooO0o(id, noteId, rectF2, c27577o00oo0O);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27585o00ooO0 = this;
            page2 = page;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f = c27577o00oo0O.f96789OooOoO;
            RectF rectF3 = c27577o00oo0O.f96790OooOoO0;
            page2 = c27577o00oo0O.f96787OooOo;
            C27585o00ooO0 c27585o00ooO02 = c27577o00oo0O.f96788OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            fMin = f;
            rectF2 = rectF3;
            c27585o00ooO0 = c27585o00ooO02;
            objOooO0o = obj;
        }
        return Page.createTnBitmapWithBounds$default(Page.copy$default(page2, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, (List) objOooO0o, null, 393215, null), c27585o00ooO0.f96848OooOOOo, rectF2, fMin, 0, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x014d -> B:27:0x0150). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27582o00oo0o0 c27582o00oo0o0;
        C27585o00ooO0 c27585o00ooO0;
        Collection arrayList2;
        Iterator it;
        C27585o00ooO0 c27585o00ooO02;
        Collection collection;
        C27585o00ooO0 c27585o00ooO03;
        Iterator it2;
        Page page;
        Collection collection2;
        Iterator it3;
        Object objOooO0O0;
        if (abstractC32479OooO0OO instanceof C27582o00oo0o0) {
            c27582o00oo0o0 = (C27582o00oo0o0) abstractC32479OooO0OO;
            int i = c27582o00oo0o0.f96828OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27582o00oo0o0.f96828OooOooO = i - Integer.MIN_VALUE;
                c27585o00ooO0 = this;
            } else {
                c27585o00ooO0 = this;
                c27582o00oo0o0 = new C27582o00oo0o0(c27585o00ooO0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27582o00oo0o0.f96827OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27582o00oo0o0.f96828OooOooO;
        int i3 = 1;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            it = arrayList.iterator();
            c27585o00ooO02 = c27585o00ooO0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 == 1) {
                collection2 = c27582o00oo0o0.f96825OooOoOO;
                page = c27582o00oo0o0.f96823OooOoO;
                it2 = c27582o00oo0o0.f96824OooOoO0;
                Collection collection3 = c27582o00oo0o0.f96821OooOo;
                c27585o00ooO03 = c27582o00oo0o0.f96822OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                collection = collection3;
                C27585o00ooO0 c27585o00ooO04 = c27585o00ooO03;
                it3 = it2;
                Page pageCopy$default = Page.copy$default(page, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, (List) obj, null, 393215, null);
                Bitmap bitmapCreateTnBitmap = pageCopy$default.createTnBitmap(c27585o00ooO04.f96848OooOOOo);
                o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
                Page.RotationDirection rotationDirection = pageCopy$default.getRotationDirection();
                float width = bitmapCreateTnBitmap.getWidth();
                float height = bitmapCreateTnBitmap.getHeight();
                oooOO02.getClass();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateTnBitmap, 0, 0, bitmapCreateTnBitmap.getWidth(), bitmapCreateTnBitmap.getHeight(), o0oo000O.OooOO0.OooOO0O(rotationDirection, width, height), true);
                kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                String strOooO0Oo = Oooo0oO.o0Oo0oo.OooO0Oo(page.getNoteId(), C18115b5.CONNECTOR, page.getId());
                c27582o00oo0o0.f96822OooOo0o = c27585o00ooO04;
                c27582o00oo0o0.f96821OooOo = collection;
                c27582o00oo0o0.f96824OooOoO0 = it3;
                c27582o00oo0o0.f96823OooOoO = page;
                c27582o00oo0o0.f96825OooOoOO = collection2;
                c27582o00oo0o0.f96828OooOooO = 2;
                objOooO0O0 = c27585o00ooO04.f96846OooOOO0.OooO0O0(bitmapCreateBitmap, strOooO0Oo, c27582o00oo0o0);
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection2 = c27582o00oo0o0.f96825OooOoOO;
            page = c27582o00oo0o0.f96823OooOoO;
            Iterator it4 = c27582o00oo0o0.f96824OooOoO0;
            Collection collection4 = c27582o00oo0o0.f96821OooOo;
            C27585o00ooO0 c27585o00ooO05 = c27582o00oo0o0.f96822OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            it3 = it4;
            collection = collection4;
            C27585o00ooO0 c27585o00ooO06 = c27585o00ooO05;
            collection2.add(Page.copy$default(page, null, null, null, null, null, null, null, (String) obj, false, 0, 0L, System.currentTimeMillis(), null, null, 0, false, null, null, null, 522111, null));
            it = it3;
            arrayList2 = collection;
            c27585o00ooO02 = c27585o00ooO06;
            i3 = 1;
            if (it.hasNext()) {
                Page page2 = (Page) it.next();
                String id = page2.getId();
                String noteId = page2.getNoteId();
                c27582o00oo0o0.f96822OooOo0o = c27585o00ooO02;
                Collection collection5 = arrayList2;
                c27582o00oo0o0.f96821OooOo = collection5;
                c27582o00oo0o0.f96824OooOoO0 = it;
                c27582o00oo0o0.f96823OooOoO = page2;
                c27582o00oo0o0.f96825OooOoOO = collection5;
                c27582o00oo0o0.f96828OooOooO = i3;
                Serializable serializableOooO0o = c27585o00ooO02.OooO0o(id, noteId, null, c27582o00oo0o0);
                if (serializableOooO0o != enumC32485OooO00o) {
                    collection = arrayList2;
                    c27585o00ooO03 = c27585o00ooO02;
                    page = page2;
                    it2 = it;
                    obj = serializableOooO0o;
                    collection2 = collection;
                    C27585o00ooO0 c27585o00ooO042 = c27585o00ooO03;
                    it3 = it2;
                    Page pageCopy$default2 = Page.copy$default(page, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, (List) obj, null, 393215, null);
                    Bitmap bitmapCreateTnBitmap2 = pageCopy$default2.createTnBitmap(c27585o00ooO042.f96848OooOOOo);
                    o0oo000O.OooOO0 oooOO022 = o0oo000O.OooOO0.f111232OooO00o;
                    Page.RotationDirection rotationDirection2 = pageCopy$default2.getRotationDirection();
                    float width2 = bitmapCreateTnBitmap2.getWidth();
                    float height2 = bitmapCreateTnBitmap2.getHeight();
                    oooOO022.getClass();
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateTnBitmap2, 0, 0, bitmapCreateTnBitmap2.getWidth(), bitmapCreateTnBitmap2.getHeight(), o0oo000O.OooOO0.OooOO0O(rotationDirection2, width2, height2), true);
                    kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
                    String strOooO0Oo2 = Oooo0oO.o0Oo0oo.OooO0Oo(page.getNoteId(), C18115b5.CONNECTOR, page.getId());
                    c27582o00oo0o0.f96822OooOo0o = c27585o00ooO042;
                    c27582o00oo0o0.f96821OooOo = collection;
                    c27582o00oo0o0.f96824OooOoO0 = it3;
                    c27582o00oo0o0.f96823OooOoO = page;
                    c27582o00oo0o0.f96825OooOoOO = collection2;
                    c27582o00oo0o0.f96828OooOooO = 2;
                    objOooO0O0 = c27585o00ooO042.f96846OooOOO0.OooO0O0(bitmapCreateBitmap2, strOooO0Oo2, c27582o00oo0o0);
                    if (objOooO0O0 != enumC32485OooO00o) {
                        c27585o00ooO06 = c27585o00ooO042;
                        obj = objOooO0O0;
                        collection2.add(Page.copy$default(page, null, null, null, null, null, null, null, (String) obj, false, 0, 0L, System.currentTimeMillis(), null, null, 0, false, null, null, null, 522111, null));
                        it = it3;
                        arrayList2 = collection;
                        c27585o00ooO02 = c27585o00ooO06;
                        i3 = 1;
                        if (it.hasNext()) {
                            return (List) arrayList2;
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ba, code lost:
    
        if (r2.f96833OooO.OooOO0(new com.orion.notein.domain.models.folder.Folder[]{r0}, r3) != r5) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Collection, java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0116 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(Folder folder, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27586o00ooO00 c27586o00ooO00;
        C27585o00ooO0 c27585o00ooO0;
        int i;
        int i2;
        int i3;
        C27586o00ooO00 c27586o00ooO002;
        Collection arrayList;
        int i4;
        int i5;
        Iterator it;
        C27585o00ooO0 c27585o00ooO02;
        Folder folder2;
        Iterator it2;
        Folder folder3;
        C27585o00ooO0 c27585o00ooO03;
        int i6;
        Collection collection;
        int i7;
        Folder folder4;
        C27585o00ooO0 c27585o00ooO04;
        Iterator it3;
        Rect rect;
        if (abstractC32479OooO0OO instanceof C27586o00ooO00) {
            c27586o00ooO00 = (C27586o00ooO00) abstractC32479OooO0OO;
            int i8 = c27586o00ooO00.f96858Oooo000;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c27586o00ooO00.f96858Oooo000 = i8 - Integer.MIN_VALUE;
                c27585o00ooO0 = this;
            } else {
                c27585o00ooO0 = this;
                c27586o00ooO00 = new C27586o00ooO00(c27585o00ooO0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27586o00ooO00.f96856OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i9 = c27586o00ooO00.f96858Oooo000;
        Throwable th = null;
        char c = 2;
        if (i9 == 0) {
            i = 77;
            i2 = 55;
            C32446OooOOOo.OooO0O0(objOooO0o);
            List listO00O0O = oOo000Oo.OooOo.o00O0O(list, new C27583o00oo0oO());
            i3 = 77;
            c27586o00ooO002 = c27586o00ooO00;
            arrayList = new ArrayList();
            i4 = 3;
            i5 = 55;
            it = listO00O0O.iterator();
            c27585o00ooO02 = c27585o00ooO0;
            folder2 = folder;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        if (i9 == 1) {
            i = 77;
            i2 = 55;
            i7 = c27586o00ooO00.f96854OooOoo;
            int i10 = c27586o00ooO00.f96855OooOoo0;
            i6 = c27586o00ooO00.f96853OooOoOO;
            Iterator it4 = c27586o00ooO00.f96851OooOoO;
            Collection collection2 = c27586o00ooO00.f96852OooOoO0;
            folder3 = c27586o00ooO00.f96849OooOo;
            C27585o00ooO0 c27585o00ooO05 = c27586o00ooO00.f96850OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            i5 = i10;
            collection = collection2;
            it2 = it4;
            c27585o00ooO03 = c27585o00ooO05;
            c27586o00ooO00.f96850OooOo0o = c27585o00ooO03;
            c27586o00ooO00.f96849OooOo = folder3;
            c27586o00ooO00.f96852OooOoO0 = collection;
            c27586o00ooO00.f96851OooOoO = it2;
            c27586o00ooO00.f96853OooOoOO = i6;
            c27586o00ooO00.f96855OooOoo0 = i5;
            c27586o00ooO00.f96854OooOoo = i7;
            c27586o00ooO00.f96858Oooo000 = 2;
            c27585o00ooO03.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27581o00oo0o((NoteContent) objOooO0o, c27585o00ooO03, null), c27586o00ooO00);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i9 == 2) {
            int i11 = c27586o00ooO00.f96854OooOoo;
            i5 = c27586o00ooO00.f96855OooOoo0;
            int i12 = c27586o00ooO00.f96853OooOoOO;
            it2 = c27586o00ooO00.f96851OooOoO;
            i = 77;
            collection = c27586o00ooO00.f96852OooOoO0;
            i2 = 55;
            Folder folder5 = c27586o00ooO00.f96849OooOo;
            C27585o00ooO0 c27585o00ooO06 = c27586o00ooO00.f96850OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            int i13 = i11;
            c27585o00ooO02 = c27585o00ooO06;
            i4 = i12;
            folder3 = folder5;
            arrayList = collection;
            c27586o00ooO002 = c27586o00ooO00;
            it = it2;
            String str = (String) objOooO0o;
            if (str != null) {
                arrayList.add(str);
            }
            folder2 = folder3;
            i3 = i13;
            if (it.hasNext()) {
                NoteMeta noteMeta = (NoteMeta) it.next();
                InterfaceC27309OooOoO interfaceC27309OooOoO = c27585o00ooO02.f96844OooOO0o;
                String id = noteMeta.getId();
                c27586o00ooO002.f96850OooOo0o = c27585o00ooO02;
                c27586o00ooO002.f96849OooOo = folder2;
                c27586o00ooO002.f96852OooOoO0 = arrayList;
                c27586o00ooO002.f96851OooOoO = it;
                c27586o00ooO002.f96853OooOoOO = i4;
                c27586o00ooO002.f96855OooOoo0 = i5;
                c27586o00ooO002.f96854OooOoo = i3;
                c27586o00ooO002.f96858Oooo000 = 1;
                Object objOooOO0o = interfaceC27309OooOoO.OooOO0o(id, c27586o00ooO002);
                if (objOooOO0o != enumC32485OooO00o) {
                    it2 = it;
                    c27586o00ooO00 = c27586o00ooO002;
                    collection = arrayList;
                    i6 = i4;
                    c27585o00ooO03 = c27585o00ooO02;
                    i7 = i3;
                    folder3 = folder2;
                    objOooO0o = objOooOO0o;
                    c27586o00ooO00.f96850OooOo0o = c27585o00ooO03;
                    c27586o00ooO00.f96849OooOo = folder3;
                    c27586o00ooO00.f96852OooOoO0 = collection;
                    c27586o00ooO00.f96851OooOoO = it2;
                    c27586o00ooO00.f96853OooOoOO = i6;
                    c27586o00ooO00.f96855OooOoo0 = i5;
                    c27586o00ooO00.f96854OooOoo = i7;
                    c27586o00ooO00.f96858Oooo000 = 2;
                    c27585o00ooO03.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27581o00oo0o((NoteContent) objOooO0o, c27585o00ooO03, null), c27586o00ooO00);
                    if (objOooO0o != enumC32485OooO00o) {
                        i13 = i7;
                        c27585o00ooO02 = c27585o00ooO03;
                        i4 = i6;
                        arrayList = collection;
                        c27586o00ooO002 = c27586o00ooO00;
                        it = it2;
                        String str2 = (String) objOooO0o;
                        if (str2 != null) {
                        }
                        folder2 = folder3;
                        i3 = i13;
                        if (it.hasNext()) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it5 = ((List) arrayList).iterator();
                            while (it5.hasNext()) {
                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile((String) it5.next());
                                if (bitmapDecodeFile != null) {
                                    arrayList2.add(bitmapDecodeFile);
                                }
                            }
                            List listO00O0O2 = oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.o00Ooo(i4, arrayList2), new o0O0o(0));
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Oooo0.o000000O.OooO0o(93), Oooo0.o000000O.OooO0o(130), Bitmap.Config.ARGB_8888);
                            kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Paint paint = new Paint();
                            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
                            paint.setShadowLayer(2.5f, 2.0f, 2.0f, Color.parseColor("#7d7d7d"));
                            List<Bitmap> list2 = listO00O0O2;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                for (Bitmap bitmap : list2) {
                                    char c2 = c;
                                    if (bitmap.getWidth() > bitmap.getHeight()) {
                                        i5 = i3;
                                        break;
                                    }
                                    c = c2;
                                }
                            }
                            int i14 = 6;
                            int iOooO0o = Oooo0.o000000O.OooO0o(93 - (((listO00O0O2.size() - 1) * 6) + i5)) / 2;
                            Iterator it6 = list2.iterator();
                            int i15 = 0;
                            while (it6.hasNext()) {
                                Object next = it6.next();
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    Throwable th2 = th;
                                    C34429OooOOo0.OooOOo();
                                    throw th2;
                                }
                                Bitmap bitmap2 = (Bitmap) next;
                                int i17 = i14;
                                Throwable th3 = th;
                                int i18 = iOooO0o;
                                Rect rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                                int iOooO0o2 = (Oooo0.o000000O.OooO0o(i17) * i15) + i18;
                                if (bitmap2.getWidth() < bitmap2.getHeight()) {
                                    it3 = it6;
                                    rect = new Rect(iOooO0o2, Oooo0.o000000O.OooO0o(27), Oooo0.o000000O.OooO0o(i2) + iOooO0o2, Oooo0.o000000O.OooO0o(104));
                                } else {
                                    it3 = it6;
                                    rect = new Rect(iOooO0o2, Oooo0.o000000O.OooO0o(104 - ((int) ((bitmap2.getHeight() * 77.0f) / bitmap2.getWidth()))), Oooo0.o000000O.OooO0o(i) + iOooO0o2, Oooo0.o000000O.OooO0o(104));
                                }
                                canvas.drawRect(rect, paint);
                                canvas.drawBitmap(bitmap2, rect2, rect, paint);
                                i14 = i17;
                                iOooO0o = i18;
                                i15 = i16;
                                th = th3;
                                it6 = it3;
                            }
                            ?? r19 = th;
                            C26681o00o0oOO c26681o00o0oOO = c27585o00ooO02.f96846OooOOO0;
                            String id2 = folder2.getId();
                            c27586o00ooO002.f96850OooOo0o = c27585o00ooO02;
                            c27586o00ooO002.f96849OooOo = folder2;
                            c27586o00ooO002.f96852OooOoO0 = r19;
                            c27586o00ooO002.f96851OooOoO = r19;
                            c27586o00ooO002.f96858Oooo000 = 3;
                            Object objOooO0O0 = c26681o00o0oOO.OooO0O0(bitmapCreateBitmap, id2, c27586o00ooO002);
                            if (objOooO0O0 != enumC32485OooO00o) {
                                folder4 = folder2;
                                objOooO0o = objOooO0O0;
                                c27585o00ooO04 = c27585o00ooO02;
                                c27586o00ooO00 = c27586o00ooO002;
                                Folder folderCopy = folder4.copy((3583 & 1) != 0 ? folder4.id : null, (3583 & 2) != 0 ? folder4.userId : null, (3583 & 4) != 0 ? folder4.parentId : null, (3583 & 8) != 0 ? folder4.recoverParentId : null, (3583 & 16) != 0 ? folder4.title : null, (3583 & 32) != 0 ? folder4.favorite : false, (3583 & 64) != 0 ? folder4.inTrashBin : false, (3583 & 128) != 0 ? folder4.creationTime : 0L, (3583 & 256) != 0 ? folder4.lastModificationTime : 0L, (3583 & 512) != 0 ? folder4.tnPath : (String) objOooO0o, (3583 & 1024) != 0 ? folder4.sortKey : null, (3583 & 2048) != 0 ? folder4.coverColor : null);
                                c27586o00ooO00.f96850OooOo0o = null;
                                c27586o00ooO00.f96849OooOo = null;
                                c27586o00ooO00.f96858Oooo000 = 4;
                            }
                        }
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i9 != 3) {
            if (i9 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        Folder folder6 = c27586o00ooO00.f96849OooOo;
        c27585o00ooO04 = c27586o00ooO00.f96850OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        folder4 = folder6;
        Folder folderCopy2 = folder4.copy((3583 & 1) != 0 ? folder4.id : null, (3583 & 2) != 0 ? folder4.userId : null, (3583 & 4) != 0 ? folder4.parentId : null, (3583 & 8) != 0 ? folder4.recoverParentId : null, (3583 & 16) != 0 ? folder4.title : null, (3583 & 32) != 0 ? folder4.favorite : false, (3583 & 64) != 0 ? folder4.inTrashBin : false, (3583 & 128) != 0 ? folder4.creationTime : 0L, (3583 & 256) != 0 ? folder4.lastModificationTime : 0L, (3583 & 512) != 0 ? folder4.tnPath : (String) objOooO0o, (3583 & 1024) != 0 ? folder4.sortKey : null, (3583 & 2048) != 0 ? folder4.coverColor : null);
        c27586o00ooO00.f96850OooOo0o = null;
        c27586o00ooO00.f96849OooOo = null;
        c27586o00ooO00.f96858Oooo000 = 4;
    }
}
