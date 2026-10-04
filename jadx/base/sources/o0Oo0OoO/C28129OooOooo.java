package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import com.orion.notein.domain.mapper.ShapeMapper;
import com.orion.notein.domain.models.page.Shape;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import o0OO00o0.C26649o00OoooO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28129OooOooo extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C26649o00OoooO f99731OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ShapeMapper f99732OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28129OooOooo(C26649o00OoooO c26649o00OoooO, ShapeMapper shapeMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(shapeMapper, "shapeMapper");
        this.f99731OooOo = c26649o00OoooO;
        this.f99732OooOoO0 = shapeMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28128OooOooO c28128OooOooO;
        if (abstractC32479OooO0OO instanceof C28128OooOooO) {
            c28128OooOooO = (C28128OooOooO) abstractC32479OooO0OO;
            int i = c28128OooOooO.f99730OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28128OooOooO.f99730OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28128OooOooO = new C28128OooOooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28128OooOooO.f99729OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28128OooOooO.f99730OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList<ShapeEntity> arrayListO00000 = o00000(ShapeEntity.class, str + "/shape");
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO00000, 10));
                for (ShapeEntity shapeEntity : arrayListO00000) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    Shape shape = this.f99732OooOoO0.toShape(shapeEntity);
                    Object obj2 = map.get(shape.getPageId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
                    arrayList.add(Shape.copy$default(shape, string, (String) obj2, 0, 0.0f, null, 0, 0, 0, false, 0, null, System.currentTimeMillis(), 2044, null));
                }
                C26649o00OoooO c26649o00OoooO = this.f99731OooOo;
                c28128OooOooO.f99730OooOoO0 = 1;
                if (c26649o00OoooO.OooO0O0(arrayList, str2, false, c28128OooOooO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(0);
        } catch (Exception e) {
            Log.e("shape", "Couldn't restore data. " + e);
            return new Integer(-999);
        }
    }
}
