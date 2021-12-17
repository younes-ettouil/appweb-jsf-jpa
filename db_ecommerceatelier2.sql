-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 17 déc. 2021 à 02:20
-- Version du serveur :  10.4.18-MariaDB
-- Version de PHP : 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_ecommerceatelier2`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `IDCAT` int(11) NOT NULL,
  `NOMCAT` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`IDCAT`, `NOMCAT`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C');

-- --------------------------------------------------------

--
-- Structure de la table `internaute`
--

CREATE TABLE `internaute` (
  `ID` bigint(20) NOT NULL,
  `DTYPE` varchar(31) DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NTELE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `internaute`
--

INSERT INTO `internaute` (`ID`, `DTYPE`, `NOM`, `PASSWORD`, `PRENOM`, `EMAIL`, `NTELE`) VALUES
(1, 'Admin', 'Admin', '1234', 'Admin', 'admin.admin@gmail.com\r\n', ''),
(3, 'Client', 'test', '1234', 'test', 'tes.yew@gmail.com', '0648675144'),
(4, 'Client', 'toto', 'toto', 'toto', 'toto@gmail.com', '234567890'),
(5, 'Client', 'toto', 'toto', 'toto', 'toto@gmail.com', '234567890'),
(6, 'Client', 'AbdelElhak', '12345', 'saadi', 'saadi.yeah@gmail.com', '0648675454');

-- --------------------------------------------------------

--
-- Structure de la table `panier_client`
--

CREATE TABLE `panier_client` (
  `idProd` bigint(20) NOT NULL,
  `idClient` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE `produit` (
  `IDPROD` bigint(20) NOT NULL,
  `NOMPROD` varchar(255) DEFAULT NULL,
  `PRIXPROD` double DEFAULT NULL,
  `id_cat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`IDPROD`, `NOMPROD`, `PRIXPROD`, `id_cat`) VALUES
(1, 'Lenovo thinkpad ', 5000, 1),
(2, 'test', 1000, 3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`IDCAT`);

--
-- Index pour la table `internaute`
--
ALTER TABLE `internaute`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `panier_client`
--
ALTER TABLE `panier_client`
  ADD PRIMARY KEY (`idProd`,`idClient`),
  ADD KEY `FK_Panier_client_idClient` (`idClient`);

--
-- Index pour la table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`IDPROD`),
  ADD KEY `FK_produit_id_cat` (`id_cat`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `IDCAT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `internaute`
--
ALTER TABLE `internaute`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT pour la table `produit`
--
ALTER TABLE `produit`
  MODIFY `IDPROD` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `panier_client`
--
ALTER TABLE `panier_client`
  ADD CONSTRAINT `FK_Panier_client_idClient` FOREIGN KEY (`idClient`) REFERENCES `internaute` (`ID`),
  ADD CONSTRAINT `FK_Panier_client_idProd` FOREIGN KEY (`idProd`) REFERENCES `produit` (`IDPROD`);

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `FK_produit_id_cat` FOREIGN KEY (`id_cat`) REFERENCES `categorie` (`IDCAT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
