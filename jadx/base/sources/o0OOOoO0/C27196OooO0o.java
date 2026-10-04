package o0OOOoO0;

import com.google.firebase.firestore.util.OooOOO;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOoO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007¨\u0006\u000e"}, m80612d2 = {"Lo0OOOoO0/OooO0o;", "", "", "Lo0OOOoO0/OooO0OO;", "OooO00o", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "images", "OooO0O0", "pdfs", "OooO0OO", "getTxts", "txts", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27196OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("images")
    private final List<C27194OooO0OO> images;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pdfs")
    private final List<C27194OooO0OO> pdfs;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("txts")
    private final List<C27194OooO0OO> txts;

    public final List<C27194OooO0OO> OooO00o() {
        return this.pdfs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27196OooO0o)) {
            return false;
        }
        C27196OooO0o c27196OooO0o = (C27196OooO0o) obj;
        return OooOOO0.OooO0O0(this.images, c27196OooO0o.images) && OooOOO0.OooO0O0(this.pdfs, c27196OooO0o.pdfs) && OooOOO0.OooO0O0(this.txts, c27196OooO0o.txts);
    }

    public final int hashCode() {
        List<C27194OooO0OO> list = this.images;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C27194OooO0OO> list2 = this.pdfs;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<C27194OooO0OO> list3 = this.txts;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<C27194OooO0OO> list = this.images;
        List<C27194OooO0OO> list2 = this.pdfs;
        List<C27194OooO0OO> list3 = this.txts;
        StringBuilder sb = new StringBuilder("TaskResult(images=");
        sb.append(list);
        sb.append(", pdfs=");
        sb.append(list2);
        sb.append(", txts=");
        return OooOOO.OooO0O0(")", sb, list3);
    }
}
