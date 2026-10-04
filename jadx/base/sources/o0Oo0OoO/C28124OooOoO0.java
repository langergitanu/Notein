package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import Oooo0oO.C21111o0ooOoO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.mapper.PageLayerMapper;
import com.orion.notein.domain.models.page.PageLayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0Oo0OoO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28124OooOoO0 extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC27318Oooo00o f99718OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final PageLayerMapper f99719OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28124OooOoO0(InterfaceC27318Oooo00o pageLayerRepo, PageLayerMapper mapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerRepo, "pageLayerRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f99718OooOo = pageLayerRepo;
        this.f99719OooOoO0 = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28118OooOo c28118OooOo;
        if (abstractC32479OooO0OO instanceof C28118OooOo) {
            c28118OooOo = (C28118OooOo) abstractC32479OooO0OO;
            int i = c28118OooOo.f99678OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28118OooOo.f99678OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28118OooOo = new C28118OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28118OooOo.f99677OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28118OooOo.f99678OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File file = new File(C21111o0ooOoO.OooO0Oo(str, "/PageLayer"));
                if (!file.exists()) {
                    file.mkdir();
                }
                if (!file.exists()) {
                    Log.e("PageLayer", "StorageDir is null. " + file);
                    return new Integer(-999);
                }
                ArrayList arrayListO000000o = o000000o(new File(file.getAbsolutePath() + "/data"), PageLayerEntity.class);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListO000000o.iterator();
                while (it.hasNext()) {
                    PageLayer pageLayer = this.f99719OooOoO0.toPageLayer((PageLayerEntity) it.next());
                    String str3 = (String) map.get(pageLayer.getNoteId());
                    PageLayer pageLayerCopy$default = str3 == null ? null : PageLayer.copy$default(pageLayer, null, str3, false, null, null, 29, null);
                    if (pageLayerCopy$default != null) {
                        arrayList.add(pageLayerCopy$default);
                    }
                }
                InterfaceC27318Oooo00o interfaceC27318Oooo00o = this.f99718OooOo;
                c28118OooOo.f99678OooOoO0 = 1;
                if (interfaceC27318Oooo00o.OooO0o0(str2, arrayList, c28118OooOo) == enumC32485OooO00o) {
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
            e.printStackTrace();
            Log.e("PageLayer", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
