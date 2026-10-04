package o0O0OOo;

import com.google.gson.annotations.Expose;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class OooO0O0 extends CommandParameters {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Expose
    public final o0O0OOOo.OooO00o f88354OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Expose
    public final List<String> f88355OooO0O0;

    public static abstract class OooO00o<C extends OooO0O0, B extends OooO00o<C, B>> extends CommandParameters.CommandParametersBuilder<C, B> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0O0OOOo.OooO00o f88356OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<String> f88357OooO0O0;

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            this.f88356OooO00o = c.f88354OooO00o;
            OooO0O0();
            this.f88357OooO0O0 = c.f88355OooO0O0;
            OooO0O0();
            return (B) OooO0O0();
        }

        public abstract B OooO0O0();

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public String toString() {
            StringBuilder sb = new StringBuilder("BaseNativeAuthCommandParameters.BaseNativeAuthCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", authority=");
            sb.append(this.f88356OooO00o);
            sb.append(", challengeType=");
            return com.google.firebase.firestore.util.OooOOO.OooO0O0(")", sb, this.f88357OooO0O0);
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19729OooO0O0 extends OooO00o<OooO0O0, C19729OooO0O0> {
        @Override // o0O0OOo.OooO0O0.OooO00o
        public final OooO00o OooO0O0() {
            return this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooO0O0(this);
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooO0O0(OooO00o<?, ?> oooO00o) {
        super(oooO00o);
        this.f88354OooO00o = oooO00o.f88356OooO00o;
        this.f88355OooO0O0 = oooO00o.f88357OooO0O0;
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public OooO00o<?, ?> toBuilder() {
        return new C19729OooO0O0().$fillValuesFrom(this);
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean canEqual(Object obj) {
        return obj instanceof OooO0O0;
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        if (!oooO0O0.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        o0O0OOOo.OooO00o oooO00o = this.f88354OooO00o;
        o0O0OOOo.OooO00o oooO00o2 = oooO0O0.f88354OooO00o;
        if (oooO00o == null) {
            if (oooO00o2 != null) {
                return false;
            }
        } else if (!oooO00o.equals(oooO00o2)) {
            return false;
        }
        List<String> list = this.f88355OooO0O0;
        List<String> list2 = oooO0O0.f88355OooO0O0;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public int hashCode() {
        int iHashCode = super.hashCode();
        o0O0OOOo.OooO00o oooO00o = this.f88354OooO00o;
        int iHashCode2 = (iHashCode * 59) + (oooO00o == null ? 43 : oooO00o.hashCode());
        List<String> list = this.f88355OooO0O0;
        return (iHashCode2 * 59) + (list != null ? list.hashCode() : 43);
    }
}
