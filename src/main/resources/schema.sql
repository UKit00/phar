DROP TABLE IF EXISTS `produits`;
CREATE TABLE IF NOT EXISTS `produits` (
  `idProduit` int,
  `nom` varchar(25) NOT NULL,
  PRIMARY KEY (`idProduit`)
);