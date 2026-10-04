package oO000Oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import oO000Oo.C31976Oooo00O;

/* JADX INFO: renamed from: oO000Oo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32009OoooooO implements C31976Oooo00O.InterfaceC31978OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Throwable f114307OooO00o;

    /* JADX INFO: renamed from: oO000Oo.OoooooO$OooO00o */
    public static final class OooO00o {
        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public static void OooO00o(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public static void OooO0O0(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public final ArrayList OooO0OO(String str) throws NamingException {
            Throwable th = C32009OoooooO.f114307OooO00o;
            if (th != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", th);
            }
            String[] strArr = {"TXT"};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                OooO00o(all2, e);
                                throw null;
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        OooO00o(all, e2);
                        throw null;
                    }
                }
                all.close();
                initialDirContext.close();
                return arrayList;
            } catch (NamingException e3) {
                OooO0O0(initialDirContext, e3);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OoooooO$OooO0O0 */
    public static final class OooO0O0 implements C31976Oooo00O.InterfaceC31977OooO0Oo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Logger f114308OooO0O0 = Logger.getLogger(OooO0O0.class.getName());

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f114309OooO00o;

        static {
            Pattern.compile("\\s+");
        }

        public OooO0O0(OooO00o oooO00o) {
            this.f114309OooO00o = oooO00o;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        @Override // oO000Oo.C31976Oooo00O.InterfaceC31977OooO0Oo
        public final List<String> OooO00o(String str) throws NamingException {
            Level level = Level.FINER;
            Logger logger = f114308OooO0O0;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            ArrayList<String> arrayListOooO0OO = this.f114309OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(arrayListOooO0OO.size())});
            }
            ArrayList arrayList = new ArrayList(arrayListOooO0OO.size());
            for (String str2 : arrayListOooO0OO) {
                StringBuilder sb = new StringBuilder(str2.length());
                int i = 0;
                boolean z = false;
                while (i < str2.length()) {
                    char cCharAt = str2.charAt(i);
                    if (z) {
                        if (cCharAt == '\"') {
                            z = false;
                        } else {
                            if (cCharAt == '\\') {
                                i++;
                                cCharAt = str2.charAt(i);
                            }
                            sb.append(cCharAt);
                        }
                    } else if (cCharAt != ' ') {
                        if (cCharAt == '\"') {
                            z = true;
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    i++;
                }
                arrayList.add(sb.toString());
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e) {
            e = e;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
        f114307OooO00o = e;
    }

    @Override // oO000Oo.C31976Oooo00O.InterfaceC31978OooO0o0
    public final OooO0O0 OooO00o() {
        if (f114307OooO00o != null) {
            return null;
        }
        return new OooO0O0(new OooO00o());
    }

    @Override // oO000Oo.C31976Oooo00O.InterfaceC31978OooO0o0
    public final Throwable OooO0O0() {
        return f114307OooO00o;
    }
}
