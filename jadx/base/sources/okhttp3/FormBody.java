package okhttp3;

import com.huawei.hms.network.embedded.C18416x7;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final MediaType f124111OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f124112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f124113OooO0O0;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/FormBody$Builder;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f124114OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f124115OooO0O0 = new ArrayList();

        public final void OooO00o(String name, String value) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(value, "value");
            ArrayList arrayList = this.f124114OooO00o;
            HttpUrl.Companion companion = HttpUrl.f124126OooOO0O;
            arrayList.add(HttpUrl.Companion.OooO00o(companion, name, 0, 0, C18416x7.f56649s, 83));
            this.f124115OooO0O0.add(HttpUrl.Companion.OooO00o(companion, value, 0, 0, C18416x7.f56649s, 83));
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/FormBody$Companion;", "", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        MediaType.f124148OooO0o0.getClass();
        f124111OooO0OO = MediaType.Companion.OooO00o("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList encodedNames, ArrayList encodedValues) {
        OooOOO0.OooO0oO(encodedNames, "encodedNames");
        OooOOO0.OooO0oO(encodedValues, "encodedValues");
        this.f124112OooO00o = Util.OooOoO0(encodedNames);
        this.f124113OooO0O0 = Util.OooOoO0(encodedValues);
    }

    public final long OooO00o(InterfaceC34526OooO0o0 interfaceC34526OooO0o0, boolean z) throws EOFException {
        C34524OooO0Oo c34524OooO0OoOooOO0O;
        if (z) {
            c34524OooO0OoOooOO0O = new C34524OooO0Oo();
        } else {
            OooOOO0.OooO0Oo(interfaceC34526OooO0o0);
            c34524OooO0OoOooOO0O = interfaceC34526OooO0o0.OooOO0O();
        }
        List<String> list = this.f124112OooO00o;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                c34524OooO0OoOooOO0O.o0OoO0o(38);
            }
            c34524OooO0OoOooOO0O.o000Oo0o(list.get(i));
            c34524OooO0OoOooOO0O.o0OoO0o(61);
            c34524OooO0OoOooOO0O.o000Oo0o(this.f124113OooO0O0.get(i));
            i = i2;
        }
        if (!z) {
            return 0L;
        }
        long j = c34524OooO0OoOooOO0O.f123723OooOo;
        c34524OooO0OoOooOO0O.OooO00o();
        return j;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return OooO00o(null, true);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getF124162OooO0OO() {
        return f124111OooO0OO;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC34526OooO0o0 sink) throws IOException {
        OooOOO0.OooO0oO(sink, "sink");
        OooO00o(sink, false);
    }
}
