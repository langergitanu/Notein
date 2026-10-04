package androidx.core.os;

import android.os.PersistableBundle;
import java.util.Map;
import kotlin.Metadata;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\b\u001a!\u0010\n\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"", "LoO00ooO/OooOOO;", "", "", "pairs", "Landroid/os/PersistableBundle;", "persistableBundleOf", "([LoO00ooO/OooOOO;)Landroid/os/PersistableBundle;", "()Landroid/os/PersistableBundle;", "", "toPersistableBundle", "(Ljava/util/Map;)Landroid/os/PersistableBundle;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PersistableBundleKt {
    public static final PersistableBundle persistableBundleOf(C32443OooOOO<String, ? extends Object>... c32443OooOOOArr) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(c32443OooOOOArr.length);
        for (C32443OooOOO<String, ? extends Object> c32443OooOOO : c32443OooOOOArr) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
        return persistableBundleCreatePersistableBundle;
    }

    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundleCreatePersistableBundle;
    }

    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
