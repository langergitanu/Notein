package o0OOo0o;

import Oooo0o0.C21009OooOooO;
import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.huawei.hms.network.embedded.C18250l0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o000Oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$logNoteInFileStorageOccupation$2", m80623f = "NoteInFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27408o000Oo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f95658OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95659OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27408o000Oo0o(C27387o0000o0 c27387o0000o0, boolean z, Continuation<? super C27408o000Oo0o> continuation) {
        super(2, continuation);
        this.f95659OooOo0o = c27387o0000o0;
        this.f95658OooOo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27408o000Oo0o(this.f95659OooOo0o, this.f95658OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27408o000Oo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        double d;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File file = new File(this.f95659OooOo0o.f95452OooOoo0.getFilesDir(), "notein_files");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "NoteInFileUseCase", "logNoteInFileStorageOccupation, beforeClear: ");
        sbOooO0O0.append(this.f95658OooOo);
        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        if (file.exists()) {
            ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(new File(file, "export"), true);
            Iterator it = arrayListOooOo00.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((File) it.next()).length();
            }
            String strOooO0OO = C31430OooO00o.OooO0OO(length);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListOooOo00) {
                if (System.currentTimeMillis() - ((File) obj2).lastModified() > C18250l0.g.f55493g) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            long length2 = 0;
            while (it2.hasNext()) {
                length2 += ((File) it2.next()).length();
            }
            String strOooO0OO2 = C31430OooO00o.OooO0OO(length2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListOooOo00.iterator();
            while (true) {
                d = 1800000.0d;
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (System.currentTimeMillis() - ((File) next).lastModified() > 1800000.0d) {
                    arrayList2.add(next);
                }
            }
            Iterator it4 = arrayList2.iterator();
            long length3 = 0;
            while (it4.hasNext()) {
                length3 = ((File) it4.next()).length() + length3;
            }
            String strOooO0OO3 = C31430OooO00o.OooO0OO(length3);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayListOooOo00) {
                double d2 = d;
                if (System.currentTimeMillis() - ((File) obj3).lastModified() > 900000.0d) {
                    arrayList3.add(obj3);
                }
                d = d2;
            }
            double d3 = d;
            Iterator it5 = arrayList3.iterator();
            long length4 = 0;
            while (it5.hasNext()) {
                length4 = ((File) it5.next()).length() + length4;
            }
            String strOooO0OO4 = C31430OooO00o.OooO0OO(length4);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayListOooOo00) {
                if (System.currentTimeMillis() - ((File) obj4).lastModified() <= 900000.0d) {
                    arrayList4.add(obj4);
                }
            }
            Iterator it6 = arrayList4.iterator();
            long length5 = 0;
            while (it6.hasNext()) {
                length5 = ((File) it6.next()).length() + length5;
            }
            String strOooO0OO5 = C31430OooO00o.OooO0OO(length5);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            int size = arrayListOooOo00.size();
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            int size4 = arrayList3.size();
            int size5 = arrayList4.size();
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(size, "logNoteInFileStorageOccupation, export files number: ", ", size: ", strOooO0OO, ", \nlastModified time bigger than 1 hour number: ");
            C21036OooOOo0.OooO0Oo(size2, ", size: ", strOooO0OO2, ", \nlastModified time bigger than 30 minutes number: ", sbOooO0OO);
            C21036OooOOo0.OooO0Oo(size3, ", size: ", strOooO0OO3, ", \nlastModified time bigger than 15 minutes number: ", sbOooO0OO);
            C21036OooOOo0.OooO0Oo(size4, ", size: ", strOooO0OO4, ", \nlastModified time smaller than 15 minutes number: ", sbOooO0OO);
            sbOooO0OO.append(size5);
            sbOooO0OO.append(", size: ");
            sbOooO0OO.append(strOooO0OO5);
            c20358OooO00o2.OooO0o0(sbOooO0OO.toString(), new Object[0]);
            ArrayList arrayListOooOo002 = C31190OooO0oo.OooOo00(new File(file, "import"), true);
            Iterator it7 = arrayListOooOo002.iterator();
            long length6 = 0;
            while (it7.hasNext()) {
                length6 += ((File) it7.next()).length();
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : arrayListOooOo002) {
                if (System.currentTimeMillis() - ((File) obj5).lastModified() > d3) {
                    arrayList5.add(obj5);
                }
            }
            Iterator it8 = arrayList5.iterator();
            long length7 = 0;
            while (it8.hasNext()) {
                length7 += ((File) it8.next()).length();
            }
            String strOooO0OO6 = C31430OooO00o.OooO0OO(length7);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : arrayListOooOo002) {
                if (System.currentTimeMillis() - ((File) obj6).lastModified() > 900000.0d) {
                    arrayList6.add(obj6);
                }
            }
            Iterator it9 = arrayList6.iterator();
            long length8 = 0;
            while (it9.hasNext()) {
                length8 += ((File) it9.next()).length();
            }
            String strOooO0OO7 = C31430OooO00o.OooO0OO(length8);
            ArrayList arrayList7 = new ArrayList();
            for (Object obj7 : arrayListOooOo002) {
                if (System.currentTimeMillis() - ((File) obj7).lastModified() > 900000.0d) {
                    arrayList7.add(obj7);
                }
            }
            Iterator it10 = arrayList7.iterator();
            long length9 = 0;
            while (it10.hasNext()) {
                length9 = ((File) it10.next()).length() + length9;
            }
            String strOooO0OO8 = C31430OooO00o.OooO0OO(length9);
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NoteInFileUseCase");
            int size6 = arrayListOooOo002.size();
            String strOooO0OO9 = C31430OooO00o.OooO0OO(length6);
            int size7 = arrayList5.size();
            int size8 = arrayList6.size();
            int size9 = arrayList7.size();
            StringBuilder sbOooO0OO2 = C21009OooOooO.OooO0OO(size6, "logNoteInFileStorageOccupation, import files number: ", ", size: ", strOooO0OO9, ", \nlastModified time bigger than 1/2 hour number: ");
            C21036OooOOo0.OooO0Oo(size7, ", size: ", strOooO0OO6, ", \nlastModified time bigger than 1/4 hour number: ", sbOooO0OO2);
            C21036OooOOo0.OooO0Oo(size8, ", size: ", strOooO0OO7, ", \nlastModified time smaller than 1/4 hour number: ", sbOooO0OO2);
            sbOooO0OO2.append(size9);
            sbOooO0OO2.append(", size: ");
            sbOooO0OO2.append(strOooO0OO8);
            c20358OooO00o3.OooO0o0(sbOooO0OO2.toString(), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
