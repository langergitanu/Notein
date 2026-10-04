package o0O0OOo;

import com.google.gson.annotations.Expose;
import com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.List;
import o0O0OOo.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public class OooO0OO extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<String> f88358OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Expose
    private final AbstractAuthenticationScheme f88359OooO0Oo;

    public static abstract class OooO00o<C extends OooO0OO, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public List<String> f88360OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public AbstractAuthenticationScheme f88361OooO0Oo;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            this.f88360OooO0OO = c.f88358OooO0OO;
            OooO0Oo();
            this.f88361OooO0Oo = ((OooO0OO) c).f88359OooO0Oo;
            OooO0Oo();
            return (B) OooO0Oo();
        }

        public abstract B OooO0Oo();

        @Override // o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public String toString() {
            return "BaseSignInTokenCommandParameters.BaseSignInTokenCommandParametersBuilder(super=" + super.toString() + ", scopes=" + this.f88360OooO0OO + ", authenticationScheme=" + this.f88361OooO0Oo + ")";
        }
    }

    public static final class OooO0O0 extends OooO00o<OooO0OO, OooO0O0> {
        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o OooO0o0() {
            return this;
        }

        @Override // o0O0OOo.OooO0OO.OooO00o
        public final OooO00o OooO0Oo() {
            return this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooO0OO(this);
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooO0OO(OooO00o<?, ?> oooO00o) {
        super(oooO00o);
        this.f88358OooO0OO = oooO00o.f88360OooO0OO;
        this.f88359OooO0Oo = oooO00o.f88361OooO0Oo;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public OooO00o<?, ?> toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean canEqual(Object obj) {
        return obj instanceof OooO0OO;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        if (!oooO0OO.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<String> list = this.f88358OooO0OO;
        List<String> list2 = oooO0OO.f88358OooO0OO;
        if (list == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list.equals(list2)) {
            return false;
        }
        AbstractAuthenticationScheme abstractAuthenticationScheme = this.f88359OooO0Oo;
        AbstractAuthenticationScheme abstractAuthenticationScheme2 = oooO0OO.f88359OooO0Oo;
        return abstractAuthenticationScheme == null ? abstractAuthenticationScheme2 == null : abstractAuthenticationScheme.equals(abstractAuthenticationScheme2);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public int hashCode() {
        int iHashCode = super.hashCode() * 59;
        List<String> list = this.f88358OooO0OO;
        int iHashCode2 = iHashCode + (list == null ? 43 : list.hashCode());
        AbstractAuthenticationScheme abstractAuthenticationScheme = this.f88359OooO0Oo;
        return (iHashCode2 * 59) + (abstractAuthenticationScheme != null ? abstractAuthenticationScheme.hashCode() : 43);
    }
}
