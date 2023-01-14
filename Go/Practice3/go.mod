module wse5947

go 1.15

require (
	github.com/dsnet/compress v0.0.1
	github.com/gookit/color v1.5.2
	github.com/hashicorp/go-version v1.6.0 // used onlu in tests
	github.com/mholt/archiver/v3 v3.5.0 // indirect
)

replace (
	github.com/hashicorp/go-version v1.1.0 => github.com/hashicorp/go-version v1.2.0
	github.com/mholt/archiver/v3 v3.4.0 => github.com/mholt/archiver/v3 v3.5.0
)

exclude github.com/gookit/color v1.3.3
