package o0OO00o0;

import android.graphics.PointF;
import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import com.orion.notein.domain.mapper.ShapeMapper;
import com.orion.notein.domain.models.page.Shape;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0OOo0o.C27419o000o00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.o00OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26649o00OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26647o00OooOO f91973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ShapeMapper f91974OooO0O0;

    public C26649o00OoooO(C26647o00OooOO localDataSource, ShapeMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f91973OooO00o = localDataSource;
        this.f91974OooO0O0 = mapper;
    }

    public final Object OooO00o(String str, C27419o000o00o c27419o000o00o) {
        C26647o00OooOO c26647o00OooOO = this.f91973OooO00o;
        c26647o00OooOO.getClass();
        Object objOooO00o = c26647o00OooOO.OooO00o(str, new C26636o00OoOo(2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(ArrayList arrayList, String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<PointF> points = ((Shape) it.next()).getPoints();
                if (!(points instanceof Collection) || !points.isEmpty()) {
                    for (PointF pointF : points) {
                        if (Float.isNaN(pointF.x) || Float.isNaN(pointF.y)) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.f91974OooO0O0.toEntity((Shape) it2.next()));
        }
        C26647o00OooOO c26647o00OooOO = this.f91973OooO00o;
        c26647o00OooOO.getClass();
        Object objOooO00o = c26647o00OooOO.OooO00o(str, new C26639o00OoOoo(z, arrayList2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26648o00OooOo c26648o00OooOo;
        C26649o00OoooO c26649o00OoooO;
        if (abstractC32479OooO0OO instanceof C26648o00OooOo) {
            c26648o00OooOo = (C26648o00OooOo) abstractC32479OooO0OO;
            int i = c26648o00OooOo.f91971OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26648o00OooOo.f91971OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26648o00OooOo = new C26648o00OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26648o00OooOo.f91969OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26648o00OooOo.f91971OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26648o00OooOo.f91970OooOo0o = this;
            c26648o00OooOo.f91971OooOoO = 1;
            C26647o00OooOO c26647o00OooOO = this.f91973OooO00o;
            c26647o00OooOO.getClass();
            objOooO00o = c26647o00OooOO.OooO00o(str2, new C26644o00Ooo0o(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26649o00OoooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26649o00OoooO = c26648o00OooOo.f91970OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26649o00OoooO.f91974OooO0O0.toShape((ShapeEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(String str, String str2, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0O00o0 o0o00o02;
        C26649o00OoooO c26649o00OoooO;
        if (abstractC32479OooO0OO instanceof o0O00o0) {
            o0o00o02 = (o0O00o0) abstractC32479OooO0OO;
            int i = o0o00o02.f92104OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0o00o02.f92104OooOoO = i - Integer.MIN_VALUE;
            } else {
                o0o00o02 = new o0O00o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o0o00o02.f92102OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0o00o02.f92104OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o0o00o02.f92103OooOo0o = this;
            o0o00o02.f92104OooOoO = 1;
            C26647o00OooOO c26647o00OooOO = this.f91973OooO00o;
            c26647o00OooOO.getClass();
            objOooO00o = c26647o00OooOO.OooO00o(str2, new C26646o00OooO0(str, rectF, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26649o00OoooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26649o00OoooO = o0o00o02.f92103OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26649o00OoooO.f91974OooO0O0.toShape((ShapeEntity) it.next()));
        }
        return arrayList;
    }
}
