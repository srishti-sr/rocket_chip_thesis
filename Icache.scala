
val tag_array  = DescribedSRAM(
    name = "mem space",
    desc = "ICache ",
    size = 1,
    data = Vec(2, UInt(tagBits.W))
  )
val tag_arrays = Seq.tabulate(tagbits_indexing_create_blocks) {
    i =>
      DescribedSRAM(
        name = s"Tag space${i}",
        desc = "ICache tag space",
        size = 1,
        data = Vec(2, UInt(tagBits.W))
      )
  }
