# Auto-Generated by cargo-bitbake 0.3.15
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get webthing could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/webthing/0.15.0"
SRC_URI += "git://github.com/WebThingsIO/webthing-rust.git;protocol=https;nobranch=1"
SRCREV = "0707c95c05230a61287ce037a6af5f7f9f5892bc"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/actix-codec/0.5.0 \
    crate://crates.io/actix-http/3.0.4 \
    crate://crates.io/actix-macros/0.2.3 \
    crate://crates.io/actix-router/0.5.0 \
    crate://crates.io/actix-rt/2.7.0 \
    crate://crates.io/actix-server/2.1.1 \
    crate://crates.io/actix-service/2.0.2 \
    crate://crates.io/actix-tls/3.0.3 \
    crate://crates.io/actix-utils/3.0.0 \
    crate://crates.io/actix-web-actors/4.1.0 \
    crate://crates.io/actix-web-codegen/4.0.0 \
    crate://crates.io/actix-web/4.0.1 \
    crate://crates.io/actix/0.13.0 \
    crate://crates.io/actix_derive/0.6.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/alloc-no-stdlib/2.0.3 \
    crate://crates.io/alloc-stdlib/0.2.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.2 \
    crate://crates.io/brotli-decompressor/2.3.2 \
    crate://crates.io/brotli/3.3.4 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.1.0 \
    crate://crates.io/bytestring/1.0.0 \
    crate://crates.io/cc/1.0.73 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/convert_case/0.4.0 \
    crate://crates.io/cookie/0.16.0 \
    crate://crates.io/cpufeatures/0.2.2 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.4 \
    crate://crates.io/crossbeam-utils/0.8.8 \
    crate://crates.io/crypto-common/0.1.3 \
    crate://crates.io/derive_more/0.99.17 \
    crate://crates.io/digest/0.10.3 \
    crate://crates.io/encoding_rs/0.8.31 \
    crate://crates.io/env_logger/0.9.0 \
    crate://crates.io/firestorm/0.5.0 \
    crate://crates.io/flate2/1.0.22 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.0.1 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-macro/0.3.21 \
    crate://crates.io/futures-sink/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/futures/0.3.21 \
    crate://crates.io/generic-array/0.14.5 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/getrandom/0.2.6 \
    crate://crates.io/h2/0.3.13 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http/0.2.6 \
    crate://crates.io/httparse/1.6.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/idna/0.2.3 \
    crate://crates.io/if-addrs-sys/0.3.2 \
    crate://crates.io/if-addrs/0.6.7 \
    crate://crates.io/if-addrs/0.7.0 \
    crate://crates.io/indexmap/1.8.1 \
    crate://crates.io/itoa/1.0.1 \
    crate://crates.io/jobserver/0.1.24 \
    crate://crates.io/json-pointer/0.3.4 \
    crate://crates.io/jsonway/2.0.0 \
    crate://crates.io/language-tags/0.3.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.122 \
    crate://crates.io/libmdns/0.6.2 \
    crate://crates.io/local-channel/0.1.2 \
    crate://crates.io/local-waker/0.1.2 \
    crate://crates.io/lock_api/0.4.7 \
    crate://crates.io/log/0.4.16 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/matches/0.1.9 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/miniz_oxide/0.4.4 \
    crate://crates.io/mio/0.8.2 \
    crate://crates.io/miow/0.3.7 \
    crate://crates.io/multimap/0.8.3 \
    crate://crates.io/ntapi/0.3.7 \
    crate://crates.io/num-integer/0.1.44 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/num_cpus/1.13.1 \
    crate://crates.io/num_threads/0.1.5 \
    crate://crates.io/once_cell/1.10.0 \
    crate://crates.io/openssl-sys/0.9.72 \
    crate://crates.io/openssl/0.10.38 \
    crate://crates.io/parking_lot/0.12.0 \
    crate://crates.io/parking_lot_core/0.9.2 \
    crate://crates.io/paste/1.0.7 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/phf/0.8.0 \
    crate://crates.io/phf_codegen/0.8.0 \
    crate://crates.io/phf_generator/0.8.0 \
    crate://crates.io/phf_shared/0.8.0 \
    crate://crates.io/pin-project-lite/0.2.8 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.25 \
    crate://crates.io/ppv-lite86/0.2.16 \
    crate://crates.io/proc-macro2/1.0.37 \
    crate://crates.io/publicsuffix/1.5.6 \
    crate://crates.io/quote/1.0.17 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_pcg/0.2.1 \
    crate://crates.io/redox_syscall/0.2.13 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.5.5 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/ryu/1.0.9 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/semver/1.0.7 \
    crate://crates.io/serde/1.0.136 \
    crate://crates.io/serde_json/1.0.79 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/sha-1/0.10.0 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/siphasher/0.3.10 \
    crate://crates.io/slab/0.4.6 \
    crate://crates.io/smallvec/1.8.0 \
    crate://crates.io/socket2/0.4.4 \
    crate://crates.io/syn/1.0.91 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/thiserror-impl/1.0.30 \
    crate://crates.io/thiserror/1.0.30 \
    crate://crates.io/time-macros/0.2.4 \
    crate://crates.io/time/0.1.43 \
    crate://crates.io/time/0.3.9 \
    crate://crates.io/tinyvec/1.5.1 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-openssl/0.6.3 \
    crate://crates.io/tokio-util/0.7.1 \
    crate://crates.io/tokio/1.17.0 \
    crate://crates.io/tracing-attributes/0.1.20 \
    crate://crates.io/tracing-core/0.1.24 \
    crate://crates.io/tracing/0.1.32 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/unicode-bidi/0.3.7 \
    crate://crates.io/unicode-normalization/0.1.19 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/uritemplate-next/0.2.0 \
    crate://crates.io/url/2.2.2 \
    crate://crates.io/uuid/0.8.2 \
    crate://crates.io/valico/3.6.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.34.0 \
    crate://crates.io/windows_aarch64_msvc/0.34.0 \
    crate://crates.io/windows_i686_gnu/0.34.0 \
    crate://crates.io/windows_i686_msvc/0.34.0 \
    crate://crates.io/windows_x86_64_gnu/0.34.0 \
    crate://crates.io/windows_x86_64_msvc/0.34.0 \
    crate://crates.io/zstd-safe/4.1.4+zstd.1.5.2 \
    crate://crates.io/zstd-sys/1.6.3+zstd.1.5.2 \
    crate://crates.io/zstd/0.10.0+zstd.1.5.2 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
"

SUMMARY = "Implementation of an HTTP Web Thing."
HOMEPAGE = "https://github.com/WebThingsIO/webthing-rust"
LICENSE = "MPL-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include webthing-rust-${PV}.inc
include webthing-rust.inc
